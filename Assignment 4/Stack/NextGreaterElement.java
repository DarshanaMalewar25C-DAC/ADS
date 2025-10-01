
/*
8. Find the next greater element for each element in an array using stack.
Example: [4, 5, 2, 25] → [5, 25, 25, -1].
*/

import java.util.Arrays;
import java.util.Stack;

class NextGreaterElement {

    static int[] findNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>(); 

        for (int i = 0; i < n; i++) {
           
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int idx = stack.pop();
                nge[idx] = arr[i]; 
            }
            stack.push(i);
        }

       
        while (!stack.isEmpty()) {
            nge[stack.pop()] = -1;
        }

        return nge;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        int[] result = findNextGreaterElements(arr);
        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Next Greater Elements: " + Arrays.toString(result));
    }
}
