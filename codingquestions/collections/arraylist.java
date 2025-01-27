package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class arraylist {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("dipika");
        al.add("halunde");
        al.add("C67");

        // Iterator itr = al.iterator();
        // while (itr.hasNext()) {
        // System.out.println(itr.next());

        // }

        for (String str : al) {
            System.out.println(str);

        }

        LinkedList<String> l1 = new LinkedList<>();

        l1.add("good");
        l1.add("good");
        l1.add("good");
        l1.add("good");

        for (String i : l1) {
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);

        HashSet<Integer> s1 = new HashSet<>();
        s1.add(5);

        s1.add(2);

        s1.add(2);
        s1.add(6);

        for (int i : s1) {
            System.out.println(i);
        }

        TreeSet<Integer> t1 = new TreeSet<>();
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {

            int val = sc.nextInt();

            t1.add(val);

        }

        // t1.add(87);
        // t1.add(45);
        // t1.add(2);
        // t1.add(799);

        for (int i : t1) {
            System.out.println(i);
        }

        Map m1 = new HashMap<>();

        m1.put(1, "dipika");
        m1.put(2, "dipika");
        m1.put(3, "dipika");
        m1.put(4, "dipika");

        System.out.println(m1);
        // we want to iterate map then first convrt to set object
        Set set = m1.entrySet();

        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();

            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}
