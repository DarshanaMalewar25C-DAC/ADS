/*
7.Search for an element in the array (linear search).
Testcase1:
Input: [10, 20, 30, 40, 50], Search Element: 30
Expected Output: Element found at index 2
*/

class SearchElement{
	public static void main(String args[]){
		int arr[] = {10,20,30,40,50};
		int Search = 30;
		boolean isFound = false;
		for(int i = 0; i<arr.length;i++){
			if(arr[i]== Search){
				System.out.println("Element found at index: "+i);
				isFound = true;
				break;
			}
		}
		if(!isFound){
			System.out.println("Element not found");
		}
	}
}
				
		
	
			
		
				
			
