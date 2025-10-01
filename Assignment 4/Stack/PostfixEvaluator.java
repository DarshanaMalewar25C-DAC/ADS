
/*6. Evaluate a postfix expression using stack.
Example: 231*+9- → -4.*/

import java.util.Scanner;

class PostfixEvaluator {

    static int evaluate(String expr) {
        int[] stack = new int[100];
        int top = -1;

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (Character.isDigit(ch)) {
                stack[++top] = ch - '0'; 
            } else {
                int b = stack[top--];
                int a = stack[top--];

                switch (ch) {
                    case '+': stack[++top] = a + b; break;
                    case '-': stack[++top] = a - b; break;
                    case '*': stack[++top] = a * b; break;
                    case '/': stack[++top] = a / b; break;
                    default:
                        System.out.println("Invalid operator: " + ch);
                        return Integer.MIN_VALUE;
                }
            }
        }

        return stack[top];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String expr = "231*+9-";

        int result = evaluate(expr);
        System.out.println("-> " + result);

        sc.close();
    }
}
