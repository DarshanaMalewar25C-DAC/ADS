
//10. Design a stack that supports getMin() in O(1) time.

import java.util.Stack;

class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public int pop() {
        if (mainStack.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; 
        }
        int popped = mainStack.pop();
        if (popped == minStack.peek()) {
            minStack.pop();
        }
        return popped;
    }

    public int top() {
        if (mainStack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1; 
        }
        return mainStack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1; 
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();

        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(1);
        stack.push(3);

        System.out.println("Current Min: " + stack.getMin());  

        stack.pop();  
        System.out.println("Current Min: " + stack.getMin());  

        stack.pop();  
        System.out.println("Current Min: " + stack.getMin());  

        stack.pop();  
        System.out.println("Current Min: " + stack.getMin());  
    }
}
