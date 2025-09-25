/*
6.Count even and odd elements in an array.
Testcase1:
Input: [1, 2, 3, 4, 5, 6]
Expected Output: Even: 3, Odd: 3
Input: [2, 4, 6, 8]
Expected Output: Even: 4, Odd: 0
*/

class EvenOdd{
	static void count(int arr[]){
		int even = 0,odd=0;
		for(int n: arr){
			if(n%2==0)
				even++;
			else
				odd++;
		}
	    System.out.println("Even: "+ even + ", Odd: " + odd);
		}
		public static void main(String args[]){
			int arr1[] = {1, 2, 3, 4, 5, 6};
			int arr2 [] = {2, 4, 6, 8}; 	
			count(arr1);
			count(arr2);
		}
}
