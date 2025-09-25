/*
Q13. Check if a Binary Tree is Balanced
A balanced tree means the height difference of left and right subtrees for every node is
≤ 1.
Test Cases:
• Input: Balanced tree → Output: True
• Input: Skewed tree (like linked list: 1→2→3→4) → Output: False
*/

class BinaryTree {
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		
		Node(int d){
			data= d;
			left = right = null;
		}
	}
	
	boolean isBalanced(Node root){
		return checkHeight(root) != -1;
	}
	int checkHeight(Node node){
		if(node==null)
			return 0;
		
		int leftHeight = checkHeight(node.left);
		if(leftHeight == -1)
			return -1;
		int rightHeight = checkHeight(node.right);
		if(rightHeight == -1)
			return -1;
		
		if(Math.abs(leftHeight - rightHeight)>1)
			return -1;
		return Math.max(leftHeight,rightHeight)+1;
	}
	
	public static void main(String args[]){
		BinaryTree b1 = new BinaryTree();
		//for balanced tree
		Node balancedRoot = new Node(1);
		balancedRoot.left = new Node(2);
        balancedRoot.right = new Node(3);
        balancedRoot.left.left = new Node(4);
        balancedRoot.left.right = new Node(5);
        balancedRoot.right.left = new Node(6);
        balancedRoot.right.right = new Node(7);
		
		System.out.println("Balanced tree -> "+b1.isBalanced(balancedRoot));
		
		//for unbalanced Skewed tree
		Node unbalancedRoot = new Node(1);
		unbalancedRoot.right = new Node(2);
        unbalancedRoot.right.right = new Node(3);
        unbalancedRoot.right.right.right = new Node(4);
		
		System.out.println("Skewed tree (like linked list: 1->2->3->4)-> " +b1.isBalanced(unbalancedRoot));
	}
}
		