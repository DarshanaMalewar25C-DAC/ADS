
//5. Reverse a string using stack.

import java.util.Scanner;

class ReverseString {

    static String reverse(String str) {
        char[] stack = new char[str.length()];
        int top = -1;

        for (int i = 0; i < str.length(); i++) {
            stack[++top] = str.charAt(i);
        }

        StringBuilder reversed = new StringBuilder();
        while (top >= 0) {
            reversed.append(stack[top--]);
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
