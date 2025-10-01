
//10. Implement a stack using two queues.

public class StackUsingTwoQueues1 {
    int size;
    int[] q1, q2;
    int front1, rear1, size1;
    int front2, rear2, size2;

    public StackUsingTwoQueues1(int capacity) {
        size = capacity;
        q1 = new int[size];
        q2 = new int[size];
        front1 = 0; rear1 = -1; size1 = 0;
        front2 = 0; rear2 = -1; size2 = 0;
    }

    void enqueue1(int val) {
        if (size1 == size) {
            System.out.println("Stack overflow");
            return;
        }
        rear1++;
        q1[rear1] = val;
        size1++;
    }

    int dequeue1() {
        if (size1 == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        int val = q1[front1];
        front1++;
        size1--;
        return val;
    }
    void enqueue2(int val) {
        if (size2 == size) {
            System.out.println("Stack overflow");
            return;
        }
        rear2++;
        q2[rear2] = val;
        size2++;
    }

    int dequeue2() {
        if (size2 == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        int val = q2[front2];
        front2++;
        size2--;
        return val;
    }


    void push(int val) {
        enqueue2(val);
        while (size1 > 0) {
            enqueue2(dequeue1());
        }

        int[] tempQ = q1; q1 = q2; q2 = tempQ;
        int tempFront = front1; front1 = front2; front2 = tempFront;
        int tempRear = rear1; rear1 = rear2; rear2 = tempRear;
        int tempSize = size1; size1 = size2; size2 = tempSize;
    }

    int pop() {
        if (size1 == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return dequeue1();
    }


    int peek() {
        if (size1 == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1[front1];
    }

    boolean isEmpty() {
        return size1 == 0;
    }

    public static void main(String[] args) {
        StackUsingTwoQueues1 stack = new StackUsingTwoQueues1(10);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); 
        System.out.println("Popped: " + stack.pop());       
        System.out.println("Popped: " + stack.pop());       

        stack.push(40);
        System.out.println("Top element: " + stack.peek()); 

        System.out.println("Is empty? " + stack.isEmpty()); 

        System.out.println("Popped: " + stack.pop());       
        System.out.println("Popped: " + stack.pop());       

        System.out.println("Is empty? " + stack.isEmpty()); 
    }
}
