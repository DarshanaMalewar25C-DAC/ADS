
/*
5. Check if a queue is palindrome (using stack or two-pointer approach).
Example: 1 → 2 → 3 → 2 → 1 → Palindrome.
*/

import java.util.Queue;        
import java.util.LinkedList;   
import java.util.Stack;

 class QueuePalindrome {
    int size;
    int front, rear;
    int[] queue;

    public QueuePalindrome(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full.");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        queue[rear] = data;
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }

        int i = front;
        System.out.print("Queue: ");
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    boolean isPalindrome() {
        if (front == -1)
            return true;

        int len = (rear >= front) ? (rear - front + 1) : (size - front + rear + 1);

        int[] stack = new int[len];
        int top = -1;

        int i = front;
        for (int count = 0; count < len; count++) {
            stack[++top] = queue[i];
            i = (i + 1) % size;
        }

        i = front;
        for (int count = 0; count < len; count++) {
            if (queue[i] != stack[top--]) {
                return false;
            }
            i = (i + 1) % size;
        }

        return true;
    }

    public static void main(String[] args) {
        QueuePalindrome q = new QueuePalindrome(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);

        q.display();

        if (q.isPalindrome()) {
            System.out.println("Queue is a Palindrome.");
        } else {
            System.out.println("Queue is NOT a Palindrome.");
        }

        System.out.println("\nTesting a non-palindrome:");

        ArrayQueuePalindrome q2 = new ArrayQueuePalindrome(10);
        q2.enqueue(1);
        q2.enqueue(2);
        q2.enqueue(3);
        q2.enqueue(4);

        q2.display();

        if (q2.isPalindrome()) {
            System.out.println("Queue is a Palindrome.");
        } else {
            System.out.println("Queue is NOT a Palindrome.");
        }
    }
}
