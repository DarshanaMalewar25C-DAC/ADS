import java.util.Scanner;

class Parenthesis {

    static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }

    static boolean isBalanced(String expr) {
        char[] stack = new char[100];
        int top = -1;

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack[++top] = ch;
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (top == -1 || !isMatching(stack[top--], ch)) {
                    return false;
                }
            }
        }

        return top == -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String expr = sc.nextLine();

        if (isBalanced(expr)) {
            System.out.println("The expression is balanced.");
        } else {
            System.out.println("The expression is not balanced.");
        }

        sc.close();
    }
}
