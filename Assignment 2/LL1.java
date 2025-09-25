/*
11. Create a LinkedList and insert elements at the end.
Testcase:
Existing LinkedList: [5, 10, 15]
Elements to insert: [20, 25]
Expected Output: LinkedList: 5 → 10 → 15 → 20 → 25
*/

class LL1 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }


    Node appendRecursive(Node node, int new_data) {
        if (node == null) {
            return new Node(new_data);
        }
        node.next = appendRecursive(node.next, new_data);
        return node;
    }


    void append(int new_data) {
        head = appendRecursive(head, new_data);
    }

 
    void display() {
        Node n = head;
        System.out.print("LinkedList: ");
        while (n != null) {
            System.out.print(n.data);
            if (n.next != null)
                System.out.print("-->");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL1 l1 = new LL1();

        l1.append(5);
        l1.append(10);
        l1.append(15);
       
        l1.append(20);
        l1.append(25);

        // Display final list
        l1.display();
    }
}