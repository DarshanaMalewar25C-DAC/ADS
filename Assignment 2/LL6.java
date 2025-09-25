/*
16. Delete a node by its value in a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Node to delete: 30
Expected Output: LinkedList: 10 → 20 → 40
*/

class LL6 {
    Node head;

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

    void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Value " + value + " not found in the list.");
        }
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
        LL6 list = new LL6();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.deleteByValue(30);
        list.display();
    }
}