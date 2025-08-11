public class ArrayAverageCalculator {

    public static void main(String[] args) {
        // Declare and initialize an array of numbers
        double[] numbers = {10.5, 20.0, 15.2, 5.8, 25.1};

        // Calculate the sum of the array elements
        double sum = 0.0;
        for (double num : numbers) { // Enhanced for loop to iterate through the array
            sum += num;
        }

        // Calculate the average
        // Ensure to cast to double if dealing with integer arrays to avoid integer division
        double average = sum / numbers.length;

        // Print the result
        System.out.println("The numbers in the array are: ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}