
//7. Implement a Priority Queue (using array or heap).

public class PriorityQueue {
    int size;
    int[] queue;
    int rear;

    public PriorityQueue(int size) {
        this.size = size;
        queue = new int[size];
        rear = -1;
    }

    void insert(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] = data;
        System.out.println(data + " inserted");
    }

    void delete() {
        if (rear == -1) {
            System.out.println("Queue is empty");
            return;
        }

        int max = queue[0];
        int pos = 0;

        for (int i = 1; i <= rear; i++) {
            if (queue[i] > max) {
                max = queue[i];
                pos = i;
            }
        }

        System.out.println("Deleted highest priority element: " + max);

        for (int i = pos; i < rear; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
    }

    void display() {
        if (rear == -1) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(10);

        pq.insert(5);
        pq.insert(1);
        pq.insert(9);
        pq.insert(3);

        pq.display();

        pq.delete();
        pq.display();

        pq.delete();
        pq.display();
    }
}
