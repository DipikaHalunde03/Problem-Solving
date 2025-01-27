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

class simple_LL {

    Node head;

    public void insertfirst(int val) {
        if (head == null) {

            Node node = new Node(val);
            node.next = null;
            head = node;

        } else {

            Node node = new Node(val);
            node.next = head; // 1 2 3 4

            head = node;

        }

    }

    public void insertlast(int val) {

        if (head == null) {

            Node node = new Node(val, null);
            head = node;

        } else {

            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;

            }

            Node node = new Node(val, curr.next);
            curr.next = node;
            // node.next = null;
        }

    }

    public void addany(int index, int val) // 1 2 ^ 3 4 // 7
    {
        if (index == 0) {
            insertfirst(val);

        }

        int size = countll();

        if (index == size) {
            insertlast(val);
        }

        Node temp = getNode(index - 1);

        Node newnode = new Node(val, temp.next);

        temp.next = newnode;

    }

    // get exact position node

    public Node getNode(int index) {
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;

        }
        return node;

    }

    public void deletefirst() {

        head = head.next;

    }

    public void deletelast() {
        Node curr = head;

        while (curr.next.next != null) {

            curr = curr.next;

        }

        curr.next = null;
    }

    public void deleteany(int index) {

        Node temp = getNode(index - 1);

        temp.next = temp.next.next;

    }

    public void display() {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;

        }

    }

    public int countll() {

        Node curr = head;
        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;

        }
        return count;
    }

    public boolean searchnode(int value) {
        Node curr = head;

        while (curr != null) {

            if (curr.val == value) {
                return true;

            }
            curr = curr.next;
        }

        return false;

    }

    public Node middleelement() {
        int count = countll();

        int mid = count / 2;

        Node newnode = getNode(mid);

        return newnode;

    }

    public void remove_duplicates() {
        Node curr = head;

        while (curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;

            } else {
                curr = curr.next;

            }
        }
    }

    public static simple_LL merge_list(simple_LL l1, simple_LL l2) {
        Node f = l1.head;
        Node s = l2.head;

        simple_LL merged = new simple_LL();
        while (f != null && s != null) {
            if (f.val < s.val) {
                merged.insertlast(f.val);

                f = f.next;

            } else {
                merged.insertlast(s.val);
                s = s.next;

            }
        }

        while (f != null) {
            merged.insertlast(f.val);

            f = f.next;

        }

        while (s != null) {
            merged.insertlast(s.val);
            s = s.next;

        }

        return merged;

    }

    public boolean check_cyclePresent() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }

        }

        return false;

    }

    public int find_length_cycle() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {

                Node temp = slow;
                int length = 0;

                do {
                    temp = temp.next;
                    length++;

                } while (temp != slow);

                return length;

            }

        }

        return 0;
    }

    public Node getmid() {
        int size_of_list = countll();

        int mid = size_of_list / 2;

        Node midnode = head;

        for (int i = 0; i < mid; i++) {
            midnode = midnode.next;
        }

        return midnode;

    }

    public void sortsimplell() {
        Node temp1;
        Node temp2;

        for (temp1 = head; temp1.next.next != null; temp1 = temp1.next) {
            for (temp2 = temp1.next; temp2.next != null; temp2 = temp2.next) {

                if (temp2.val < temp1.val) {
                    Node swap1 = temp1;
                    temp2 = temp1;
                    temp1 = swap1;

                }
            }

        }

        head = temp1;

    }

    public simple_LL sortsimplell2(simple_LL l1) {
        Node temp1;
        Node temp2;

        for (temp1 = l1.head; temp1.next.next != null; temp1 = temp1.next) {
            for (temp2 = temp1.next; temp2.next != null; temp2 = temp2.next) {

                if (temp2.val < temp1.val) {
                    Node swap1 = temp1;
                    temp2 = temp1;
                    temp1 = swap1;

                }
            }

        }

        head = temp1;
        return l1;

    }

    public static void main(String[] args) {

        simple_LL l1 = new simple_LL();
        // Node head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(2);
        // head.next.next.next = new Node(2);
        // head.next.next.next.next = new Node(2);

        l1.insertlast(9);
        l1.insertlast(2);
        l1.insertlast(8);
        l1.insertlast(4);
        l1.insertlast(5);

        l1.display();
        l1.sortsimplell();
        System.out.println();
        l1.display();
        System.out.println();
        simple_LL ans = l1.sortsimplell2(l1);
        ans.display();
        // boolean ans = l1.check_cyclePresent();

        // System.out.println(ans);

        // simple_LL l2 = new simple_LL();

        // l2.insertlast(1);
        // l2.insertlast(2);
        // l2.insertlast(3);
        // l2.insertlast(9);
        // l2.insertlast(10);

        // l1.display();
        // System.out.println("\n");
        // l2.display();
        // System.out.println("\n");

        // simple_LL ans = simple_LL.merge_list(l1, l2);

        // ans.display();

        // l1.remove_duplicates();

        // l1.display();
        // System.out.println("\n");

        // int result = l1.countll();
        // System.out.println(result);

        // System.out.print(" \n ");

        // l1.deletefirst();
        // l1.display();
        // System.out.print(" \n ");
        // l1.deletelast();

        // l1.display();
        // System.out.print(" \n ");
        // l1.deleteany(2);
        // l1.display();

        // System.out.print(" \n ");
        // l1.addany(1, 7);
        // l1.display();
        // System.out.print(" \n ");

        // int result = l1.countll();
        // System.out.println(result + " nodes are present in LL");

        // boolean search = l1.searchnode(9);
        // if (search == true) {
        // System.out.println("element is present ");
        // } else {
        // System.out.println("element is not present ");

        // }

        // Node middle_element = l1.middleelement();

        // System.out.println(middle_element.val);

    }

}