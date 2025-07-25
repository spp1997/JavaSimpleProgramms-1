public class RightTriangleStarPattern {
    public static void main(String[] args) {
        int rows = 5; // Define the number of rows for the pattern

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}