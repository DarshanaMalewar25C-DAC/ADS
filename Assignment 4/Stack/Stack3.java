
//3. Write a program to push, pop, peek, and display elements of a stack.



//2. Implement a Stack using linked list.

class Node{
	int data;
	Node next;
	
	Node(int d){
		data = d;
		next = null;
	}
}

class Stack3{
	Node head;
	
	Stack3(){
		this.head= null;
	}
	
	boolean isEmpty(){
		return head == null;
	}
	
	void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
		System.out.println(new_data + " is pushed");
	}
	void pop() {
    if (isEmpty()) {
        System.out.println("Underflow");
        return;
    }

    int poppedData = head.data;          
    head = head.next;                     
    System.out.println(poppedData + " is popped");
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
		Stack3 s = new Stack3();
		s.push(100);
		s.push(200);
		s.push(300);
		s.pop();
		//System.out.println(s.pop() + " element is popped ");
		System.out.println(s.peek() + " element is at peek" );
	}
}
	
	
