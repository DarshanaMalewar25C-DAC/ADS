/*
Q10. Search in BST
Write a program to search for a value in a BST. Return true if found, false otherwise.
Test Case:
BST from Q4 → Search for 40 → Output: Found     //50, 30, 20, 40, 70, 60, 80
BST from Q4 → Search for 90 → Output: Not Found
*/

class BST1 {
	Node root;
	
	static class Node{
		int data;
		Node left,right;
		
		Node(int d){
			data=d;
			left=right= null;
		}
	}
	
	BST1(){
		root = null;
	}
	
	void insert(int key){
		root = insertdata(root, key);
	}
	Node insertdata(Node root,int key){
		if(root == null){
			root = new Node(key);
		    return root;
		}
		if(key<root.data)
			root.left = insertdata(root.left,key);
		else if(key> root.data)
			root.right = insertdata(root.right,key);
		return root;
	}
	
	 Node search(Node root,int key){
		if(root == null || root.data == key)
			return root ;
		if(key<root.data)
			return search(root.left,key);
		else if(key>root.data)
			return search(root.right,key);
		return root;
	}
	
	public static void main(String args[]){
		BST1 b1= new BST1();
		b1.insert(50);
		b1.insert(30);
		b1.insert(20);
		b1.insert(40);
		b1.insert(70);
		b1.insert(60);
		b1.insert(80);
		
		int key = 40;
		Node res = b1.search(b1.root,key);
		if(res!=null)
			System.out.println(key+ ": Found!");
		else
			System.out.println(key + ": Not Found!");
		
	    key = 90;
		res = b1.search(b1.root,key);
		if(res!=null)
			System.out.println(key+ ": Found!");
		else
			System.out.println(key + ": Not Found!");
	}
}
		
