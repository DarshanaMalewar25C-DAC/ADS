/*
10. Find the second largest element in the array.
Testcase:
Input: [10, 20, 30, 40, 50]
Expected Output: 40
*/


class SecondLargeElement{
	static int largest = Integer.MIN_VALUE;
	static int secondlargest = Integer.MIN_VALUE;
	
	static void findsecondlargest(int arr[],int index){
		if(index==arr.length){
			return;
		}
		if (arr[index]>largest){
			secondlargest = largest;
			largest = arr[index];
		}
		else if(arr[index]> secondlargest && arr[index]!=largest){
			secondlargest = arr[index];
		}
		findsecondlargest(arr, index+1);
		
	}
	
	public static void main(String args[]){
		int[] arr = {10, 20, 30, 40, 50};
		findsecondlargest(arr,0);
		if(secondlargest==Integer.MIN_VALUE){
			System.out.println("Second largest element not found");
		}
		else{
			System.out.println(secondlargest);
		}
	}
}
		
		
	