A simple interest program in Java calculates the interest earned on a principal amount based on a given rate and time. The formula for simple interest is SI = (P * R * T) / 100, where P is the principal, R is the rate of interest, and T is the time period.

Here is a simple Java program that calculates simple interest by taking user input:

Explanation:

import java.util.Scanner;: This line imports the Scanner class, which is used to get input from the user.

public class SimpleInterest { ... }: This defines the main class for the program.

public static void main(String[] args) { ... }: This is the main method where the program execution begins.

Scanner input = new Scanner(System.in);: An object of the Scanner class is created to read input from the standard input stream (keyboard).

Variable Declaration: double variables are declared to store the principal amount, rate, time, and the calculated simple interest. double is used to handle decimal values.

User Input: System.out.print() is used to display prompts to the user, and input.nextDouble() reads the double-precision floating-point values entered by the user.

Calculation: The simple interest is calculated using the formula (principal * rate * time) / 100.

Output: System.out.println() displays the calculated simple interest to the console.

input.close();: It is good practice to close the Scanner object when it is no longer needed to prevent resource leaks.