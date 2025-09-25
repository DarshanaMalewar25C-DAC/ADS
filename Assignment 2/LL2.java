/*
12.Insert a new node at the beginning of a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30]
Node to insert: 5
Expected Output: LinkedList: 5 → 10 → 20 → 30
*/

class LL2 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void insertAtBeginning(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
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
                System.out.print(" --> ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL2 list = new LL2();
        list.append(10);
        list.append(20);
        list.append(30);
        list.insertAtBeginning(5);
        list.display();
    }
}