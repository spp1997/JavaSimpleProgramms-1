public class LeapYearChecker {

    public static boolean isLeapYear(int year) {
        // A year is a leap year if it's divisible by 4,
        // AND (it's not divisible by 100 OR it's divisible by 400).
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int year1 = 2024; // A common leap year
        int year2 = 1900; // A century year, not a leap year
        int year3 = 2000; // A century year, which is a leap year
        int year4 = 2023; // Not a leap year

        System.out.println(year1 + " is a leap year: " + isLeapYear(year1));
        System.out.println(year2 + " is a leap year: " + isLeapYear(year2));
        System.out.println(year3 + " is a leap year: " + isLeapYear(year3));
        System.out.println(year4 + " is a leap year: " + isLeapYear(year4));
    }
}