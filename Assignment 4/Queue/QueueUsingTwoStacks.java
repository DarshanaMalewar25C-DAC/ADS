

//9. Implement a queue using two stacks.

public class QueueUsingTwoStacks {
    int[] stack1, stack2;
    int top1, top2;
    int size;

    public QueueUsingTwoStacks(int size) {
        this.size = size;
        stack1 = new int[size];
        stack2 = new int[size];
        top1 = -1;
        top2 = -1;
    }

    public void enqueue(int data) {
        if (top1 == size - 1) {
            System.out.println("Queue is full");
            return;
        }
        stack1[++top1] = data;
        System.out.println(data + " enqueued");
    }

    public int dequeue() {
        if (top2 == -1) {
            if (top1 == -1) {
                System.out.println("Queue is empty");
                return -1;
            }

            while (top1 != -1) {
                stack2[++top2] = stack1[top1--];
            }
        }
        return stack2[top2--];
    }

    public void display() {
        if (top1 == -1 && top2 == -1) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = top2; i >= 0; i--) {
            System.out.print(stack2[i] + " ");
        }

        for (int i = 0; i <= top1; i++) {
            System.out.print(stack1[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks q = new QueueUsingTwoStacks(10);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();
    }
}
