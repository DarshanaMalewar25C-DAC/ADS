/*
Q2. Insertion Sort
Implement Insertion Sort to arrange elements in ascending order.
Test Cases:
• Input: [12, 11, 13, 5, 6] → Output: [5, 6, 11, 12, 13]
• Input: [4, 3, 2, 10, 12] → Output: [2, 3, 4, 10, 12]
*/

class Isort{
	void isort(int arr[]){
		int n= arr.length;
		for(int  i =1;i<n;i++){
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] > key){
				arr[j+1]= arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	 void display(int arr[]){
		 int n = arr.length;
		 for(int i=0;i<n;i++)
			 System.out.print(arr[i] + " ");
		 System.out.println();
	 }
	 
	 public static void main(String args[]){
		 Isort i1 = new Isort();
		 int arr[] = {12,11,13,5,6};
		 i1.display(arr);
		 
		 i1.isort(arr);
		 i1.display(arr);
	 }
}