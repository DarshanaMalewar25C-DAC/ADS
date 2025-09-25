/*
3. Calculate the sum of all array elements. Solve this problem using iterative and recursion method
Testcase1:
Input: [1, 2, 3, 4, 5]
Expected Output: 15
Testcase2:
Input: [-1, 2, -3, 4, -5]
Expected Output: -3
*/

/*
//Method 1: Iteration
class SumOfArray{
	public static void main(String args[]){
		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = {-1, 2, -3, 4, -5};
		
		int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }

        int sum2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
	System.out.println(sum1);   // 15
    System.out.println(sum2);  
	}
}

*/


//Method 2: recursion
class SumOfArray{
	static int SumArray(int arr[],int n){
		if(n==0)
			return 0;
		return arr[n-1]+SumArray(arr , n-1);
	}
	
	public static void main(String args[]){
		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = {-1, 2, -3, 4, -5};
		System.out.println(SumArray(arr1, arr1.length)); 
		System.out.println(SumArray(arr2, arr2.length)); 
	}
}