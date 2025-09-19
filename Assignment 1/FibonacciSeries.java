/*
4. Fibonacci Series
Problem: Write a Java program to print the first n numbers in the Fibonacci series.
Test Cases:
Input: n = 5
Output: [0, 1, 1, 2, 3]
Input: n = 8
Output: [0, 1, 1, 2, 3, 5, 8, 13]
*/

//Method 1 :Loop
class FibonacciSeries{
	public static void main(String args[]){
		int n = 8, FirstNum = 0, SecondNum = 1;
		for(int i = 1; i<=n;++i){
			System.out.print(FirstNum + ", ");
			int nextNum = FirstNum + SecondNum;
			FirstNum = SecondNum;
			SecondNum = nextNum;
		}
	}
}
			
		
/*
//Method 2 : Recursion
class FibonacciSeries{
	static int fibonacci(int n){
		if(n<=1){
			return 1;
		}
		else{
			return fibonacci(n-1) + fibonacci(n-2);  //Recursive condition
		}
	}
		public static void main(String args[]){
			int n=25;
			for(int i=1;i<=n;i++){
				System.out.println("Series="+fibonacci(i)+"");
			}
		}
}
*/