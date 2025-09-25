/*
Q8. Inorder, Preorder, Postorder Traversals
Implement recursive functions to print inorder, preorder, and postorder traversals.
Test Case:
Tree:
      10
     /  \
    20  30
   / \
  40 50
• Inorder: 40 20 50 10 30
• Preorder: 10 20 40 50 30
• Postorder: 40 50 20 30 10
*/

class Traversal{
	Node root;
	
	static class Node{
		int data;
		Node left,right;
		
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	Traversal(){
		root = null;
	}
	Traversal(int d){
		root = new Node(d);
	}
	//inorder
	void inorder(Node n){
		if(n==null)
			return;
		inorder(n.left);
		System.out.print(n.data+ " ");
		inorder(n.right);
	}
	
	//Preorder
	void preorder(Node n){
		if(n==null)
			return;
		System.out.print(n.data+ " ");
		preorder(n.left);
		preorder(n.right);
	}
	
	// postorder
	void postorder(Node n){
		if(n == null)
			return ;
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.data+ " ");
	}
	
	public static void main(String args[]){
		Traversal t1 = new Traversal();
		t1.root = new Node(10);
		t1.root.left = new Node(20);
		t1.root.right = new Node(30);
		t1.root.left.left = new Node(40);
		t1.root.left.right = new Node(50);
		
		System.out.print("Inorder: ");
		t1.inorder(t1.root);
		System.out.println();
		
		System.out.print("Pre-order: ");
		t1.preorder(t1.root);
		System.out.println();
		
		System.out.print("Post-order: ");
		t1.postorder(t1.root);
	}
}
		