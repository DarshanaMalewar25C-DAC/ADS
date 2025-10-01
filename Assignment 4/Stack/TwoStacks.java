
//9. Implement two stacks in a single array.

class TwoStacks {
    int[] arr;
    int size;
    int top1, top2;

    TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;      
        top2 = size;     
    }

    void push1(int x) {
        if (top1 + 1 == top2) {
            System.out.println("Stack Overflow for Stack 1");
            return;
        }
        arr[++top1] = x;
    }

    void push2(int x) {
        if (top2 - 1 == top1) {
            System.out.println("Stack Overflow for Stack 2");
            return;
        }
        arr[--top2] = x;
    }


    int pop1() {
        if (top1 == -1) {
            System.out.println("Stack Underflow for Stack 1");
            return -1;
        }
        return arr[top1--];
    }

    int pop2() {
        if (top2 == size) {
            System.out.println("Stack Underflow for Stack 2");
            return -1;
        }
        return arr[top2++];
    }

    void displayStack1() {
        System.out.print("Stack 1: ");
        for (int i = 0; i <= top1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void displayStack2() {
        System.out.print("Stack 2: ");
        for (int i = size - 1; i >= top2; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(10);

        ts.push1(1);
        ts.push1(2);
        ts.push1(3);

        ts.push2(10);
        ts.push2(9);
        ts.push2(8);

        ts.displayStack1();  
        ts.displayStack2(); 

        System.out.println("Popped from Stack 1: " + ts.pop1());  
        System.out.println("Popped from Stack 2: " + ts.pop2());  

        ts.displayStack1();  
        ts.displayStack2();  
    }
}
