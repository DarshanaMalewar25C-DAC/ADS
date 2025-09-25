/*
Q10. Insert into a BST
Write a program to insert nodes into a BST and print inorder traversal.
Test Case:
Insert: 50, 30, 20, 40, 70, 60, 80
Tree (BST) Inorder: 20 30 40 50 60 70 80
*/

class BST{
	Node root;
	static class Node{
		int data;
		Node left,right;
		
		Node(int d){
			data=d;
			left=right= null;
		}
	}
	BST(){
		root = null ;
	}
	//inorder
	void inorder(Node n){
		if(n==null)
			return;
		inorder(n.left);
		System.out.print(n.data + " ");
		inorder(n.right);
	}
	
	void insert(int key){
		root = insertdata(root,key);
	}
	Node insertdata(Node root, int key){
		if(root == null){
			root = new Node(key);
			return root;
		}
		if(key< root.data)
			root.left = insertdata(root.left,key);
		else if(key>root.data)
			root.right = insertdata(root.right,key);
		return root;
	}
	
	public static void main(String args[]){
		BST b1 = new BST();
		
		b1.insert(50);
		b1.insert(30);
		b1.insert(20);
		b1.insert(40);
		b1.insert(70);
		b1.insert(60);
		b1.insert(80);
		
		System.out.print("Tree(BST) Inorder: ");
		b1.inorder(b1.root);
	}
}