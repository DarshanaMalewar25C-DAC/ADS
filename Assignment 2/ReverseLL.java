/*
19.Reverse a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Expected Output: LinkedList: 40 → 30 → 20 → 10
Existing LinkedList: []
Expected Output: LinkedList: (empty)
*/  

class ReverseLL{
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data= d;
			this.next=null;
		}
	}
	void append(int new_data){
		Node new_node = new Node(new_data);
		//LL empty
		if(head == null){
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last = head;
		while(last.next != null){
			last = last.next;
		}
		last.next = new_node;
	}
	
	void display(){
		Node n = head;//starting point of LL
		while(n != null){
			System.out.print(n.data);
			if (n.next != null)
				System.out.print(" --> ");
			n = n.next;
		}
		
		
	}
	Node reverse(Node n){
		Node prev = null;
		Node curr= n;
		Node next = null;
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		n = prev;
		return n;
	}
	public static void main(String args[]){
		ReverseLL l1 = new ReverseLL();
	    l1.append(10);
	    l1.append(20);
	    l1.append(30);
	    l1.append(40);
	    l1.display();
	
	    l1.head = l1.reverse(l1.head);
        System.out.print("\nReversed list:");
        l1.display();
	}
}