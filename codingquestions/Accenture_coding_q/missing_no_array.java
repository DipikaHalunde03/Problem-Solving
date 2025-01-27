package Accenture_coding_q;

import java.util.ArrayList;

// common intersecotion of array
public class missing_no_array {
    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 4, 5 };

        int arr2[] = { 7, 2, 9, 4, 5 };
        int size = arr1.length;

        ArrayList<Integer> al = new ArrayList<>();

        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {

                    al.add(arr1[i]);
                    break;

                }

            }

        }

        for (int i : al) {
            System.out.println(i);
        }
    }

}
