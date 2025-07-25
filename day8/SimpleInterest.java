import java.util.Scanner; // Import the Scanner class for user input

public class SimpleInterest {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Declare variables for principal, rate, time, and simple interest
        double principal;
        double rate;
        double time;
        double simpleInterest;

        // Prompt the user to enter the principal amount
        System.out.print("Enter principal amount: ");
        principal = input.nextDouble(); // Read the principal amount

        // Prompt the user to enter the annual interest rate
        System.out.print("Enter annual interest rate (as a percentage, e.g., 5 for 5%): ");
        rate = input.nextDouble(); // Read the rate

        // Prompt the user to enter the time period in years
        System.out.print("Enter time period in years: ");
        time = input.nextDouble(); // Read the time period

        // Calculate simple interest using the formula
        simpleInterest = (principal * rate * time) / 100;

        // Display the calculated simple interest
        System.out.println("Simple Interest: " + simpleInterest);

        // Close the scanner object to release system resources
        input.close();
    }
}