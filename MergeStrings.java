import java.util.Scanner;

public class MergeStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        
        int len1 = str1.length();
        int len2 = str2.length();

        
        char[] merged = new char[len1 + len2];

        
        for (int i = 0; i < len1; i++) {
            merged[i] = str1.charAt(i);
        }

        
        for (int i = 0; i < len2; i++) {
            merged[len1 + i] = str2.charAt(i);
        }

        
        String mergedString = new String(merged);

        
        System.out.println("Merged string: " + mergedString);

        scanner.close();
    }
}
