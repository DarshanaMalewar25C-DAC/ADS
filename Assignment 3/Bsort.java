/*
Q1. Bubble Sort
Write a program to implement Bubble Sort on an integer array.
Test Cases:
• Input: [5, 2, 9, 1, 5, 6] → Output: [1, 2, 5, 5, 6, 9]
• Input: [3, 2, 1] → Output: [1, 2, 3]
• Input: [1, 2, 3] → Output: [1, 2, 3]
*/

class Bsort{
	void bsort(int arr[]){
		int n = arr.length;
		for(int i=0; i<n-1;i++){
			for(int j=0; j<n-i-1;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	void display(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		Bsort b1 = new Bsort();
		int arr[] = {5,2,9,1,5,6};
		b1.display(arr);
		b1.bsort(arr);
		b1.display(arr);
	}
}