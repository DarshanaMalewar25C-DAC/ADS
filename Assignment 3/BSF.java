/*
Q9. Level Order Traversal (BFS)
Implement level-order traversal of a binary tree.
Test Case:
Tree:
      1
    /  \
   2    3
  / \  / \
 4   56   7
Output: 1 2 3 4 5 6 7
*/
import java.util.*;
class BSF{
	Node root;
	
	static class Node{
		int data;
		Node left , right;
		
		Node(int d){
			data= d;
			left = right= null;
		}
	}
	void levelOrderTraversal(Node root) {
        if (root == null)
            return;
	    Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
	
	public static void main(String args[]){
		BSF b1= new BSF();
		b1.root= new Node(1);
		b1.root.left= new Node(2);
		b1.root.right = new Node(3);
		b1.root.left.left = new Node(4);
		b1.root.left.right= new Node(5);
		b1.root.right.left= new Node(6);
		b1.root.right.right= new Node(7);
		
		System.out.println("Level of traversal: ");
		b1.levelOrderTraversal(b1.root);
	}
}
	