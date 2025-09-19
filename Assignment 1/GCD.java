/*
5. Find GCD
Problem: Write a Java program to find the Greatest Common Divisor (GCD) of two
numbers.
Test Cases:
Input: a = 54, b = 24
Output: 6
Input: a = 17, b = 13
Output: 1 */

//Method 1 : Iteration
class GCD {
	public static void main(String args[]){
		int a = 17, b = 13;
		int gcd = 1;
		for(int i=1; i<=a && i<=b;++i){
			if(a%i==0 && b%i==0)
			gcd = i;
		}
		System.out.println(gcd);
	}
}


/*
//Method 2 : Recursion
class GCD{

	public static int hcf(int a, int b){
		if(b!=0)
			return hcf(b,a%b);
		else
			return a;
	}
	public static void main(String args[]){
		int a = 54, b = 24;
		int hcf = hcf(a,b);
		System.out.println(hcf);
	}
}
*/