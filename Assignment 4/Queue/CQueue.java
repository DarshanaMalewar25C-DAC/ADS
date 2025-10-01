
//4. Implement a Circular Queue using arrays.

public class CQueue {
    int size = 5;
    int CQ[] = new int[size]; 
    int rear, front;

    CQueue() {
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return (front == -1);
    }

    boolean isFull() {
        return ((rear + 1) % size == front);
    }

    void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) { 
                front = 0;
            }
            rear = (rear + 1) % size;
            CQ[rear] = x;
            System.out.println(x + " Inserted.");
        }
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;  
        } else {
            int x = CQ[front];
            System.out.println(x + " Deleted.");
            if (front == rear) { 
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return x;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue elements: ");
            int i = front;
            while (i != rear) {
                System.out.print(CQ[i] + " ");
                i = (i + 1) % size;
            }
            System.out.println(CQ[i]); 
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CQueue q1 = new CQueue();

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
