
//3. Write a program to enqueue, dequeue, and display elements of a queue.


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class Queue3 {
    Node front, rear;


    Queue3() {
        front = rear = null;
    }

    void enqueue(int x) {
        Node newNode = new Node(x);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(x + " enqueued.");
    }


    int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int value = front.data;
        front = front.next;


        if (front == null) {
            rear = null;
        }

        System.out.println(value + " dequeued.");
        return value;
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue3 q = new Queue3();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display(); 

        q.dequeue(); 
        q.dequeue(); 

        q.display(); 

        q.enqueue(50);
        q.display(); 
    }
}
