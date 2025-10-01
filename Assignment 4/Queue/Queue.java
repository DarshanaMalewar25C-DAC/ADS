
//1. Implement a Queue using arrays.
//Linkedlist Implementation

public class Queue {
	int size = 5;
	int Q[] = new int[size];
	int rear, front;
	
	Queue(){
		front = -1;
		rear = -1;
	}
	
	boolean isEmpty(){
		return (front == -1);
	}
	
	boolean isFull(){
		return (rear == size-1);
	}
	
	void enqueue(int x){
		if(isFull()){
			System.out.println("Queue is full");
			return;
		}else{
			if(front == -1){
				front = 0;
			}
			rear++;
			Q[rear] = x;
			System.out.println(x+" Inserted.");
		}
		
	}
	
	int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return 0;
		}else{
		int x = Q[front];
		System.out.println(x+" Deleted.");
		if( front >= rear){
			front = -1;
			rear = -1;
		}else
			front++;
		return x;
		}
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}else{
			for(int i=front;i<=rear;i++){
				System.out.print(Q[i]+ " ");
			}
			System.out.println();
		}
			
	}
	
    public static void main(String[] args) {
		
		Queue q1 = new Queue();
		q1.enqueue(11);
		q1.enqueue(22);
		q1.enqueue(33);
		q1.enqueue(44);
		q1.enqueue(55);
		q1.enqueue(99);
		System.out.println();
		q1.display();
		System.out.println();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		System.out.println();
		q1.display();
		
		q1.dequeue();
		System.out.println();
		q1.display();
       		
		}
 }