package DSA;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;

    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;

    }
}

public class Circular_LL {

    private Node head;
    private Node tail;

    public Circular_LL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            return;

        }

        tail.next = node;
        node.next = head;
        tail = node;

    }

    public void delete(int value) {

        Node temp = head;

        if (temp == null) // empty list
        {
            return;

        }

        if (temp.val == value) // if it is first node
        {
            head = head.next;
            tail.next = head;
            return;

        }

        do {

            if (temp.next.val == value) {
                temp.next = temp.next.next;
                break;

            }

            temp = temp.next;

        } while (temp != head);

    }

    public void display() {

        Node node = head;

        if (head != null) {
            do {
                System.out.print(node.val + " ->");
                node = node.next;

            } while (node != head);
        }

        System.out.println("\n");

    }

    public static void main(String[] args) {

        Circular_LL c1 = new Circular_LL();

        c1.insert(1);
        c1.insert(2);
        c1.insert(3);
        c1.insert(4);
        c1.insert(5);
        c1.display();

        c1.delete(1);
        c1.display();

        c1.delete(5);
        c1.display();

    }

}
