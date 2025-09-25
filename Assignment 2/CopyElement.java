/*
8. Copy elements of one array into another.
Testcase:
Input: Source Array: [1, 2, 3, 4, 5]
Expected Output: Destination Array: [1, 2, 3, 4, 5]
*/

public class CopyElement{
	 static void copy(int source[],int destination[],int index){
		 if(index == source.length){
		 return; }
		 destination[index]= source[index];
		 copy(source,destination,index+1);
	 }
	 public static void main(String args[]){
		 int sourceArray[] = {1,2,3,4,5};
		 int destinationArray[] = new int[sourceArray.length];
		 
		 copy(sourceArray,destinationArray,0);
		 System.out.print("Destination Array: ");
		 for(int i = 0;i<destinationArray.length;i++)
			 System.out.print(destinationArray[i]+", ");
	 }
}