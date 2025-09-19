/*
6. Find Square Root
Problem: Write a Java program to find the square root of a given number (using
integer approximation).
Test Cases:
Input: x = 16
Output: 4
Input: x = 27
Output: 5
*/ 
/*
//Method 1 : Iteration
class SquareRoot{
	public static void main(String args[]) {
        int x = 16;
        int i = 0;

        while(i * i <= x) {
            i++;
        }

        System.out.println(i - 1);
	}
}		

*/

//Method 2 : Recursion
class SquareRoot{
	public static int sqrt(int x,int start,int end){
		if(start>end)
			return end;
		int mid = (start + end)/2;
		long square = (long)mid*mid;
		if(square == x)
			return mid;
		else if(square<x)
			return sqrt(x,mid+1,end);
		else
			return sqrt(x,start,mid-1);
	}
	public static void main(String args[]){
		int x1 = 16;
		int x2 = 27;
		System.out.println(sqrt(x1,1,x1));
		System.out.println(sqrt(x2,1,x2));
	}
}
		