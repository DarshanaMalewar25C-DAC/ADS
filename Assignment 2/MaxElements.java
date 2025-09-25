/*
1. Find the maximum element in an array. Solve this problem using iterative and recursion method
Testcase1:
Input: [10, 25, 47, 3, 19]
Expected Output: 47
Testcase2:
Input: [-5, -10, -3, -20, -7]
Expected Output: -3
*/
/*
//Method 1: Iteration
class MaxElements{
	public static void main(String args[]){
		//int[] arr = {10,25,47,3,19};
		int[] arr = {-5,-10,-3,-20,-7};
		int max = arr[0];
		
		for(int i = 1; i <arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
	*/	
//Method 2: recursion
class MaxElements{
	static int findMax(int[] arr, int n){
		if(n==1){
			return arr[0];
		}
		return Math.max(arr[n], findMax(arr, n - 1));
	}
	public static void main(String args[]){
		int arr[] = {10,25,47,3,19};
		int max = findMax(arr, arr.length-1);
		System.out.println(max);
	}
}