/*
Q3. Selection Sort
Sort an array using Selection Sort.
Test Cases:
• Input: [64, 25, 12, 22, 11] → Output: [11, 12, 22, 25, 64]
• Input: [29, 10, 14, 37, 13] → Output: [10, 13, 14, 29, 37]
*/

class SSort{
	void ssort(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++){
			int min = i;
			for(int j = i+1;j<n;j++){
				if(arr[j] < arr[min])
					min = j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	void display(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String args[]){
		SSort s1= new SSort();
		int arr[] = {64, 25, 12, 22, 11};
		s1.display(arr);
		
		s1.ssort(arr);
		s1.display(arr);
	}
}