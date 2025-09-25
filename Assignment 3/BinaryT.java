/*
Q7. Create a Binary Tree & Print Preorder Traversal
Write a program to create a binary tree and print its preorder traversal.
Test Case:
Tree:
    1
   / \
  2   3
 / \
 4 5
Expected Output (Preorder): 1 2 4 5 3
*/

class BinaryT{
	Node root;
	static class Node{
		int data;
		Node left,right;
		
		Node(int d){
			data= d;
			left=right = null;
		}
	}
	BinaryT(){
		root = null;
	}
	BinaryT(int d){
		root = new Node(d);
	}
	//Preorder
	void preorder(Node n){
		if(n == null)
			return;
		System.out.print(n.data + " ");
		preorder(n.left);
		preorder(n.right);
	}
	
	public static void main(String args[]){
		BinaryT b1 = new BinaryT();
		b1.root = new Node(1);
		b1.root.left = new Node(2);
		b1.root.right = new Node(3);
		b1.root.left.left = new Node(4);
		b1.root.left.right = new Node(5);
		
		System.out.print("Preorder: ");
		b1.preorder(b1.root);
		
	}
}