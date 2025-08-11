To add the elements of an array in Java, one typically calculates their sum. This involves iterating through the array and accumulating the value of each element into a running total.

Explanation:
Array Declaration and Initialization:
An integer array named numbers is declared and initialized with some sample values.

Sum Variable Initialization:
An integer variable sum is initialized to 0. This variable will store the cumulative sum of the array elements.

Iteration:
A for-each loop is used to iterate through each element in the numbers array. In each iteration, the current element is assigned to the number variable.

Accumulation:
Inside the loop, sum += number; adds the value of the current number to the sum variable. This operation repeatedly updates sum with the running total.

Output:
After the loop completes, System.out.println() prints the final calculated sum.