package DSA;

class Node {
    int val;
    Node next;
    Node pre;

    Node(int val) {
        this.val = val;

    }

    Node(int val, Node next, Node pre) {
        this.val = val;
        this.next = next;
        this.pre = pre;

    }
}

public class double_LL {
    Node head;

    public void addfirst(int val) {

        Node newnode = new Node(val);
        newnode.pre = null;
        newnode.next = head;// head
        if (head != null) {
            head.pre = newnode;

        }
        head = newnode;

    }

    public void addlast(int val) {

        Node newnode = new Node(val);

        Node temp = head;

        if (head == null) // if ll is empty
        {

            newnode.pre = null;
            head = newnode;

        }

        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newnode;
        newnode.pre = temp;
        newnode.next = null;

    }

    public void addatany(int index, int val) {

        int size = getsize_LL();

        if (index == 1) {
            addfirst(val);
        } else if (index == size) {
            addlast(val);
        } else {

            if (index > size) {
                System.out.println("index is greater than size ");
                return;
            }

            Node temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;

            }

            Node newnode = new Node(val, temp.next, temp);
            temp.next = newnode;
            newnode.next.pre = newnode;
        }

    }

    public Node getNode(int index) {
        Node curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;

        }

        return curr;

    }

    public int getsize_LL() {

        if (head == null) {
            System.out.println("LL is empty");

        }
        Node curr = head;

        int count = 0;

        while (curr != null) {
            count = count + 1;
            curr = curr.next;

        }

        return count;

    }

    public void deletefirst() {

        head = head.next;

    }

    public void deletelast() {
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;

        }

        temp.next = null;

    }

    public void deleteany(int index) {

        Node prenode = getNode(index - 1);

        prenode.next = prenode.next.next;

        prenode.next.pre = prenode;

    }

    public void display() {
        Node temp = head;

        while (temp != null) {

            System.out.print(temp.val + "->");
            temp = temp.next;

        }
        System.out.println("\n");

    }

    public void displayrev() {
        Node temp = head;
        Node last = null;

        while (temp != null) {
            last = temp;

            temp = temp.next;

        }

        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.pre;

        }

        System.out.println("\n");

    }

    public Node given_value_node(int value) {
        Node temp = head;

        while (temp != null) {
            if (temp.val == value)
                return temp;

            temp = temp.next;

        }
        return null;

    }

    public void addat_after_value(int after, int val) {

        Node temp = given_value_node(after);

        if (temp == null) {
            System.out.println("not exist value");
        }

        Node newnode = new Node(val);

        newnode.next = temp.next;
        temp.next = newnode;
        newnode.pre = temp;
        if (newnode.next != null) {
            newnode.next.pre = newnode;

        }

    }

    public static void main(String[] args) {
        double_LL d1 = new double_LL();

        d1.addfirst(2);
        d1.addfirst(3);
        d1.addfirst(4);
        d1.addfirst(5);

        d1.display();

        d1.addlast(9);
        d1.display();

        d1.addatany(2, 10);
        d1.display();

        d1.addatany(6, 20);
        d1.display();

        d1.addatany(7, 30);
        d1.display();

        d1.addatany(9, 40);
        d1.display();
        d1.displayrev();

        d1.deletefirst();
        d1.display();

        d1.deletelast();
        d1.display();

        d1.deleteany(2);
        d1.display();

        d1.addat_after_value(10, 200);
        d1.display();

    }

}
