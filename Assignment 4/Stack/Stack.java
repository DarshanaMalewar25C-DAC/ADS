

//1. Implement a Stack using arrays.


class Stack {
	static final int MAX = 10;
	int top;
	int a[] = new int [MAX];
	
	Stack(){
		top = -1;
	}
	
	boolean isFull(){
		return(top>MAX-1);
	}

	boolean isEmpty(){
		return(top<0);
	}
	
	boolean push(int x){
		if(top>MAX-1){
			System.out.println("Stack is overflow");
			return false;
		}
		else{
			a[++top] = x;
			System .out.println(x + " element inserted");
			return true;
		}
	}
	
	int pop(){
		if(top<0){
			System.out.println("Stack is underflow" );
			return 0;
		}
		else{
			int x =a[top--];
			return x;
		}
	}
	
	int peek(){
		if(top<0){
			System.out.println("Stack is underflow" );
			return 0;
		}
		else{
			int x = a[top];
			return x;
		}
	}
	
	public static void main(String args[]){
		Stack s1 = new Stack();
		s1.push(11);
		s1.push(22);
		s1.push(33);
		
		System.out.println(s1.pop() + " element is popped ");
		System.out.println(s1.peek() + " element is at peek" );
	}
}
