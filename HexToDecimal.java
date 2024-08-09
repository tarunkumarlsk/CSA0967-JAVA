import java.util.Scanner;

public class HexToDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.nextLine();

        
        int decimal = hexToDecimal(hex);

        
        System.out.println("Decimal equivalent: " + decimal);

        scanner.close();
    }

    
    private static int hexToDecimal(String hex) {
        
        return Integer.parseInt(hex, 16);
    }
}
