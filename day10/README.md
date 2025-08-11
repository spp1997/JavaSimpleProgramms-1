A Java program to reverse an array can be implemented using a two-pointer approach, which modifies the array in-place without creating a new one

Explanation:
main method:
An originalArray is initialized with some integer values.
The Arrays.toString() method is used to print the array before and after reversal for clear demonstration.
The reverseArray() method is called to perform the reversal.

reverseArray method:

Pointers Initialization: start is initialized to 0 (the first element's index) and end is initialized to arr.length - 1 (the last element's index).
while loop: The loop continues as long as start is less than end. This ensures that elements are swapped until the pointers meet or cross, indicating the array has been fully reversed.
Swapping: Inside the loop, the elements at the start and end positions are swapped using a temporary variable temp.
Pointer Movement: After each swap, start is incremented and end is decremented, moving the pointers closer to the center of the array.