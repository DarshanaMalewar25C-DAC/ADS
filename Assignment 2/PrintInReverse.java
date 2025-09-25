/*
5. Print array elements in reverse order.
Testcase1:
Input: [1, 2, 3, 4, 5]
Expected Output: [5, 4, 3, 2, 1]
Testcase2:
Input: [-1, 2, -3, 4, -5]
Expected Output: [-5, 4, -3, 2, -1]
*/

class PrintInReverse{
	static void Reverse(int arr[]){
		for(int i = arr.length -1;i>=0;i--){
			System.out.print(arr[i]);
			if(i!=0)
				System.out.print(", ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		int arr1[] = {1, 2, 3, 4, 5};
	    int arr2[] = {-1, 2, -3, 4, -5};
		Reverse(arr1);
		Reverse(arr2);
	}
}