public class ArraySum {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Initialize a variable to store the sum
        int sum = 0;

        // Iterate through the array using a for-each loop
        for (int number : numbers) {
            sum += number; // Add each element to the sum
        }

        // Print the calculated sum
        System.out.println("The sum of array elements is: " + sum);
    }
}