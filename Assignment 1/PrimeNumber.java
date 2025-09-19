/*
2. Prime Number
Problem: Write a Java program to check if a given number is prime.
Test Cases:
Input: 29
Output: true
Input: 15
Output: false
*/

/*
//Method 1: Iteration
public class PrimeNumber{
	public static boolean isPrime(int n){
		if(n<=1){
			return false;
		}
	    for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		// int n = 29;
		// int n = 15;
		System.out.println(isPrime(29));
		System.out.println(isPrime(15));
	}
}
*/			
			
//Method 2: Recursion
public class PrimeNumber{
	public static boolean isPrime(int n){
		return checkNum(n,2);
	}
	private static boolean checkNum(int n,int i) {
		if(n<=1)
			return false;
		if(i==n)
			return true;
		if(n%i==0)
			return false;
		return checkNum(n,i+1);
	}
	
	public static void main(String args[]){
		System.out.println(isPrime(29));
		System.out.println(isPrime(15));
	}
}
		
	