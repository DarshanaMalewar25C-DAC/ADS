/*
4.Find the average of array elements
Testcase1:
Input: [10, 20, 30, 40, 50]
Expected Output: 30.0
Testcase2:
Input: [-5, 10, 15, -10, 5]
Expected Output: 3.0
*/

class Avgfind{
	static double avg(int[] arr){
		int sum = 0;
		for(int n:arr){
			sum=sum+n;
		}
		return (double)sum/arr.length;
	}
	public static void main(String args[]){
		int arr1[]= {10, 20, 30, 40, 50};
		int arr2[]= {-5, 10, 15, -10, 5};
		
		System.out.println(avg(arr1));
		System.out.println(avg(arr2));
	}
}