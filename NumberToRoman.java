import java.util.Scanner;

public class NumberToRoman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number (1 to 3999): ");
        int number = scanner.nextInt();

        
        if (number < 1 || number > 3999) {
            System.out.println("Number out of range. Please enter a number between 1 and 3999.");
        } else {
            
            String roman = convertToRoman(number);

            

            
            System.out.println("Roman numeral equivalent: " + roman);
        }

        scanner.close();
    }

    
    private static String convertToRoman(int number) {
        
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder roman = new StringBuilder();

        
        for (int i = 0; i < values.length; i++) {
            
            while (number >= values[i]) {
                roman.append(romanSymbols[i]);
                number -= values[i];
            }
        }

        return roman.toString();
    }
}
