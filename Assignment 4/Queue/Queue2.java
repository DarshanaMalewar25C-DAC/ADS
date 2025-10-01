

//2. Implement a Queue using linked list.

// Node class for linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue class using Linked List
public class Queue2 {
    Node front, rear;

    // Constructor
    Queue2() {
        front = rear = null;
    }

    // Check if queue is empty
    boolean isEmpty() {
        return front == null;
    }

    // Add element to the rear of the queue
    void enqueue(int x) {
        Node newNode = new Node(x);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(x + " Inserted.");
    }

    // Remove element from the front of the queue
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int x = front.data;
        System.out.println(x + " Deleted.");
        front = front.next;

        // If queue becomes empty
        if (front == null) {
            rear = null;
        }

        return x;
    }

    // Display elements of the queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // Main method to test the queue
    public static void main(String[] args) {
        Queue2 q1 = new Queue2();

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

      
    }
}
