import java.util.Scanner;

public class DaysConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for conversions
        final int DAYS_IN_YEAR = 365;
        final int DAYS_IN_WEEK = 7;

        // Prompt user for input
        System.out.println("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        // Calculate years, weeks, and days
        int years = totalDays / DAYS_IN_YEAR;
        int remainingDaysAfterYears = totalDays % DAYS_IN_YEAR;
        int weeks = remainingDaysAfterYears / DAYS_IN_WEEK;
        int days = remainingDaysAfterYears % DAYS_IN_WEEK;

        // Output the result
        System.out.println(totalDays + " days are equivalent to:");
        System.out.println(years + " years");
        System.out.println(weeks + " weeks");
        System.out.println(days + " days");

        scanner.close();
    }
}
