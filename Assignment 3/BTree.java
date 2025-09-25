/*
Q12. Height of Binary Tree
Write a recursive function to find the height of a binary tree.
Test Case:
Tree:
   1
  / \
 2   3
/ \
4 5
Height = 3
*/

class BTree {
	Node root;
	
	static class Node{
		int data;
		Node left,right;
		
		Node(int d){
			data = d;
			left=right = null;
		}
	}
	int height(Node root){
		if(root == null)
			return 0;
		int left = height(root.left);
		int right = height(root.right);
		return 1+ Math.max(left,right);
	}
	
	
	public static void main(String args[]){
		BTree b1 = new BTree();
		b1.root = new Node(1);
		b1.root.left = new Node(2);
		b1.root.right = new Node(3);
		b1.root.left.left = new Node(4);
		b1.root.left.right = new Node(5);
		
		int h = b1.height(b1.root);
		System.out.println("Height = " + h);
		
	}
}
		