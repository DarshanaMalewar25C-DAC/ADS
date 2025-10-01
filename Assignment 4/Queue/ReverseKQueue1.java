

/*8. Reverse the first K elements of a queue.
Example: Queue = [1,2,3,4,5], K=3 → [3,2,1,4,5].*/

public class ReverseKQueue1 {
    int[] queue;
    int front, rear, size;

    public ReverseKQueue1(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int data) {
        if (size == queue.length) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear] = data;
        size++;
    }


    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = queue[front];
        front++;
        size--;
        return val;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public void reverseFirstK(int k) {
        if (k > size || k < 0) {
            System.out.println("Invalid value of K");
            return;
        }

        int[] stack = new int[k];
        int top = -1;

        for (int i = 0; i < k; i++) {
            stack[++top] = dequeue();
        }

        int[] tempQueue = new int[queue.length];
        int tempRear = -1;

        while (top >= 0) {
            tempQueue[++tempRear] = stack[top--];
        }

        while (size > 0) {
            tempQueue[++tempRear] = dequeue();
        }

        front = 0;
        rear = tempRear;
        size = rear + 1;
        for (int i = 0; i <= rear; i++) {
            queue[i] = tempQueue[i];
        }
    }

    public static void main(String[] args) {
        ReverseKQueue1 q = new ReverseKQueue1(10);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println("Original Queue:");
        q.display();

        int k = 3;
        System.out.println("\nAfter reversing first " + k + " elements:");
        q.reverseFirstK(k);
        q.display();
    }
}
