1. Using if-else Statements:
This approach involves a series of conditional checks to determine the largest number.

Explanation:
The first if statement checks if num1 is greater than or equal to both num2 and num3. If true, num1 is the maximum.
If the first condition is false, the else if statement checks if num2 is greater than or equal to both num1 and num3. If true, num2 is the maximum.
If both previous conditions are false, it implies num3 must be the largest, so the else block executes, printing num3.


2. Using the Ternary Operator:
The ternary operator provides a concise way to express conditional logic.

Explanation: 
This single line of code uses nested ternary operations. It first compares num1 to num2 and num3. If num1 is the largest, it's assigned to max. Otherwise, it proceeds to compare num2 and num3 to find the maximum among them.