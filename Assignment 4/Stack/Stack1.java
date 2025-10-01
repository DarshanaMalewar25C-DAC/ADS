

//2. Implement a Stack using linked list.

class Node{
	int data;
	Node next;
	
	Node(int d){
		data = d;
		next = null;
	}
}

class Stack1{
	Node head;
	
	Stack1(){
		this.head= null;
	}
	
	boolean isEmpty(){
		return head == null;
	}
	
	void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	void pop(){
		if(isEmpty()){
			System.out.println("Underflow");
			return;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		temp = null;

	}
		
	int peek(){
		if(!isEmpty())
			return head.data;
		else{
			
			System.out.println("Underflow");
			return 0;
		}
			
	}
	

	
	public static void main(String args[]){
		Stack1 s = new Stack1();
		s.push(11);
		s.push(22);
		s.push(33);
		s.pop();
		//System.out.println(s.pop() + " element is popped ");
		System.out.println(s.peek() + " element is at peek" );
	}
}
	
	
