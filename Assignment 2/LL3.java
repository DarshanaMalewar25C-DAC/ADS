/*
13. Insert a new node at a given position in a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Node to insert: 25 at position 2
Expected Output: LinkedList: 10 → 20 → 25 → 30 → 40
*/

class LL3 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node append(Node node, int new_data) {
        if (node == null) {
            return new Node(new_data);
        }
        node.next = append(node.next, new_data);
        return node;
    }

    void append(int new_data) {
        head = append(head, new_data);
    }
    void insertAtPosition(int new_data, int position) {
        Node new_node = new Node(new_data);

        if (position == 0) {
            new_node.next = head;
            head = new_node;
            return;
        }

        Node current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        new_node.next = current.next;
        current.next = new_node;
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
        LL3 list = new LL3();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.insertAtPosition(25, 2);

        list.display();
    }
}