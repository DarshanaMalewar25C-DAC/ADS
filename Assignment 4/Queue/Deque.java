

//6. Implement a Double Ended Queue (Deque).

 class Deque {
    int size;
    int front, rear;
    int[] deque;
        Deque(int size) {
        this.size = size;
        deque = new int[size];
        front = -1;
        rear = -1;
    }


    boolean isFull() {
        return ((front == 0 && rear == size - 1) || (front == rear + 1));
    }

    boolean isEmpty() {
        return (front == -1);
    }

    void insertFront(int data) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front = front - 1;
        }

        deque[front] = data;
        System.out.println(data + " inserted at front");
    }

    void insertRear(int data) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else if (rear == size - 1) {
            rear = 0;
        } else {
            rear = rear + 1;
        }

        deque[rear] = data;
        System.out.println(data + " inserted at rear");
    }

    void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println(deque[front] + " deleted from front");

        if (front == rear) {
            front = rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
    }


    void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println(deque[rear] + " deleted from rear");

        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear--;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.print("Deque elements: ");
        int i = front;
        while (true) {
            System.out.print(deque[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    void getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
        } else {
            System.out.println("Front element: " + deque[front]);
        }
    }

    void getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
        } else {
            System.out.println("Rear element: " + deque[rear]);
        }
    }


    public static void main(String[] args) {
        Deque dq = new Deque(5);

        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertFront(2);
        dq.insertRear(30); 

        dq.display();

        dq.deleteFront();
        dq.deleteRear();

        dq.display();

        dq.getFront();
        dq.getRear();
    }
}
