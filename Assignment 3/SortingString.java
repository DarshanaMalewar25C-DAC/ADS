/*
Q6. Sorting Strings (Lexicographic Order)
Write a program to sort an array of strings using any sorting algorithm.
Test Cases:
• Input: ["apple", "banana", "cherry", "date"] → Output: ["apple", "banana",
"cherry", "date"]
• Input: ["dog", "cat", "elephant", "bee"] → Output: ["bee", "cat", "dog",
"elephant"]
*/

class SortingString{
	static void insertionStringsort(String arr[]){
		int n = arr.length;
		for(int i=1;i<n;i++){
			String key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j].compareTo(key)>0){
				arr[j+1]=arr[j];
				j= j-1;
			}
			arr[j+1]= key;
		}
	}
	void display(String arr[]){
		int n = arr.length;
		for(int i =0;i<n;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static void main(String args[]){
		SortingString s1 = new SortingString();
		String arr[] = {"dog", "cat", "elephant", "bee"};
		
		System.out.println("String: ");
		s1.display(arr);
		
		insertionStringsort(arr);
		System.out.println("Sorted String: ");
		s1.display(arr);
	}
}