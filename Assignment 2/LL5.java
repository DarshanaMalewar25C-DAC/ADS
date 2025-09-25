/*
15. Delete the last node of a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Expected Output: LinkedList: 10 → 20 → 30
*/

class LL5 {
    Node head;

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node appendRecursive(Node node, int data) {
        if (node == null) return new Node(data);
        node.next = appendRecursive(node.next, data);
        return node;
    }

    void append(int data) {
        head = appendRecursive(head, data);
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    void display() {
        Node temp = head;
        System.out.print("LinkedList: ");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" --> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL5 list = new LL5();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.deleteLast();
        list.display();
    }
}