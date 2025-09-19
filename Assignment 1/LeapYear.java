/*
10. Leap Year
Problem: Write a Java program to check if a given year is a leap year.
Test Cases:
Input: 2020
Output: true
Input: 1900
Output: false
*/


/*
//Method 1 : Iteration
class LeapYear{
	    public static boolean isLeap(int year) {
        for (int i = year; i <= year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int year1 = 2020;
        int year2 = 1900;

        System.out.println(isLeap(year1));
        System.out.println(isLeap(year2));
    }
}
		
*/


//Method 2 : Recursion
class LeapYear{
	public static boolean isLeap(int year) {
		if(year%4!=0)
			return false;
		else if(year%100!=0)
			return true;
		else if(year%400==0)
			return true;
		else
			return false;
	}
	public static void main(String args[]){
		int year1 = 2020;
		int year2 = 1500;
		
		System.out.println(isLeap(year1));
		System.out.println(isLeap(year2));
	}
}
		

