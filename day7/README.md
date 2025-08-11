To check if a year is a leap year in Java, the following conditions must be met:
The year must be divisible by 4.
If the year is a century year (ends in '00'), it must also be divisible by 400.
If the year is a century year but not divisible by 400, it is not a leap year.

This logic can be implemented concisely using a single boolean expression:

Explanation of the isLeapYear method:
year % 4 == 0: Checks if the year is divisible by 4.
year % 100 != 0: Checks if the year is not a century year. 
year % 400 == 0: Checks if the year, if it is a century year, is also divisible by 400.

The && (AND) operator ensures both conditions are true, while the || (OR) operator allows for either the non-century leap year condition or the century leap year condition to be true.