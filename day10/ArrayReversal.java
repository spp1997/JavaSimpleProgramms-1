import java.util.Arrays;

public class ArrayReversal {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        reverseArray(originalArray);

        System.out.println("Reversed Array: " + Arrays.toString(originalArray));
    }

    /**
     * Reverses the elements of an integer array in-place.
     *
     * @param arr The array to be reversed.
     */
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end pointers
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move pointers towards the center
            start++;
            end--;
        }
    }
}