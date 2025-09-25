/*
2. Find the minimum element in an array.
Testcases1:
Input: [15, 8, 22, 5, 19]
Expected Output: 5
Testcase2:
Input: [-4, -15, -7, -2, -30]
Expected Output: -30
*/

class MinElement{
	static int findMin(int[] arr, int n){
		if(n==1){
			return arr[0];
		}
		return Math.min(arr[n-1], findMin(arr, n - 1));
	}
	public static void main(String args[]){
		int arr1[] = {115,8,22,5,19};
		int min1 = findMin(arr1, arr1.length);
		System.out.println(min1);
		int arr2[] = {-4,-15,-7,-2,-30};
		int min2 = findMin(arr2, arr2.length);
		System.out.println(min2);
	}
}