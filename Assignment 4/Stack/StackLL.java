
//2. Implement a Stack using linked list.

//Linkedlist Implementation

class Node{
	int data;
	Node next;
	
	Node(int d){
		this.data = d;
		this.next = null;
	}
}

class StackLL{
	Node head;
	StackLL(){
		this.head = null;
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
	
	
	


    public static void main(String[] args) {
        StackLL s = new StackLL();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.peek()+ " : Peek element ");  
		s.pop();
		//System.out.println(s.pop()+ " : element Popped");    
		System.out.println(s.peek()+ " : Peek element ");  
		s.pop();
		System.out.println(s.peek()+ " : Peek element "); 
		s.pop();
		System.out.println(s.peek()+ " : Peek element "); 		
		}
 }