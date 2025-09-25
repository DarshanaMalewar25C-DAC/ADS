/*
Q5. Quick Sort
Implement Quick Sort using the last element as the pivot.
Test Cases:
• Input: [10, 7, 8, 9, 1, 5] → Output: [1, 5, 7, 8, 9, 10]
• Input: [1, 1, 1, 1] → Output: [1, 1, 1, 1]
*/

class Qsort{
	static void qsort(int arr[], int low,int high){
		if(low<high){
			int pi = partition(arr,low,high);
			qsort(arr, low, pi-1);
			qsort(arr,pi+1,high);
		}
	}
	static int partition(int arr[],int low,int high){
		int pivot = arr[high];
		int i = (low-1);
		for(int j=low;j<=high-1;j++){
			if(arr[j] < pivot){
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return(i+1);
	}
	static void swap(int arr[], int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	void display(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+ " ");
		System.out.println();
	}
	
	public static void main(String args[]){
		Qsort s1 = new Qsort();
		int arr[] = {10, 7, 8, 9, 1, 5};
		int n = arr.length;
		
		System.out.println("Quick sort: ");
		s1.display(arr);
		
		s1.qsort(arr,0,n-1);
		System.out.println("Quick sort: Sorted array: ");
		s1.display(arr);
	}
}