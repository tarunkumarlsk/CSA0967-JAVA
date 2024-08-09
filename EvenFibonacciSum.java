import java.util.Scanner;

public class EvenFibonacciSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms in the Fibonacci series: ");
        int numberOfTerms = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        int sumOfEvenTerms = 0;

        for (int i = 1; i <= numberOfTerms; i++) {
            int currentTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = currentTerm;

            if (currentTerm % 2 == 0) {
                sumOfEvenTerms += currentTerm;
            }
        }
        
        System.out.println("The sum of even terms in the Fibonacci series up to " + numberOfTerms + " terms is: " + sumOfEvenTerms);

        scanner.close();
    }
}
