/*
Q14. Convert Sorted Array to Balanced BST
Write a program to convert a sorted array into a balanced BST.
Test Case:
Input: [1, 2, 3, 4, 5, 6, 7]
Output (Preorder example): 4 2 1 3 6 5 7
*/

class SortedArrayToBST{
	Node root;
	
	static class Node{
		int data;
		Node left,right;
		
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	// Convert sorted array to balanced BST
	Node sortedArrayToBST(int arr[], int start,int end){
		if(start>end)
			return null;
		int mid = (start+ end)/2;
		Node node = new Node(arr[mid]);
		
		// Recursively build left and right subtrees
		node.left = sortedArrayToBST(arr,start,mid-1);
		node.right = sortedArrayToBST(arr, mid+1,end);
		return node;
	}
	
	//preorder
	void preorder(Node n){
		if(n == null)
			return;
		System.out.print(n.data + " ");
		preorder(n.left);
		preorder(n.right);
	}
	
	public static void main(String args[]){
		SortedArrayToBST s1 = new SortedArrayToBST();
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		
		s1.root = s1.sortedArrayToBST(arr,0,arr.length-1);
		
		System.out.print("Preorder Array: ");
		s1.preorder(s1.root);
	}
}
		