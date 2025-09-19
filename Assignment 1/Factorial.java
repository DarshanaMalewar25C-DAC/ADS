/*
3. Factorial
Problem: Write a Java program to compute the factorial of a given number.
Test Cases:
Input: 5
Output: 120
Input: 0
Output: 1
*/

//Method 1:- Iteration
public class Factorial{
	public static void main(String args[]){
		int n = 5;
		int fact = 1;
		
		for(int i = 1;i<=n;i++){
			fact=fact*1;
		}
		System.out.println(n+fact);
		System.out.println(fact);
	}
}
	


/*

//Method 2 :- Recursion
public class Factorial{
	public static int fact(int n){
		if(n<=1)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String args[]){
		System.out.println(fact(5));
		System.out.println(fact(0));
	}
}
			*/