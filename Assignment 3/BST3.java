/*
Q11. Minimum & Maximum Node in BST
Find the smallest and largest element in a BST.
Test Case:
BST from Q4 → Min: 20, Max: 80
*/

class BST3{
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	void insert(int key){
		root = insertdata(root, key);
	}
	Node insertdata(Node root,int key){
		if(root == null)
			root = new Node(key);
		if(key<root.data)
			root.left = insertdata(root.left , key);
		else if(key > root.data)
			root.right = insertdata(root.right, key);
		return root;
	}
	int findMin(Node root){
		if(root ==null)
			return -1;
		while(root.left != null){
			root = root.left;
		}
		return root.data;
	}
	int findMax(Node root){
		if(root== null)
			return -1;
		while(root.right!= null){
			root = root.right;
		}
		return root.data;
	}
	
	public static void main(String args[]){
		BST3 b1 = new BST3();
		
		b1.insert(50);
		b1.insert(30);
		b1.insert(20);
		b1.insert(40);
		b1.insert(70);
		b1.insert(60);
		b1.insert(80);
		
		int min = b1.findMin(b1.root);
		int max = b1.findMax(b1.root);
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}
}
	