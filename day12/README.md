A Java program to calculate the average of numbers stored in an array involves two main steps: summing all the elements in the array and then dividing that sum by the total number of elements. 

Explanation:

Array Declaration and Initialization:
A double array named numbers is declared and initialized with sample values. Using double allows for handling decimal numbers.

Sum Calculation:
A for-each loop iterates through each num in the numbers array, adding its value to the sum variable.

Average Calculation:
The average is calculated by dividing the sum by numbers.length, which provides the total count of elements in the array. It is important to ensure that at least one of the operands in the division is a double to prevent integer division truncation if the array were of integers.

Output:
The program prints the original numbers, their sum, and the calculated average to the console.