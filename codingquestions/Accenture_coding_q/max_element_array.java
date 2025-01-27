package Accenture_coding_q;

import DSA.insertion;

public class max_element_array {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int max = arr[0];
        for (int i = 1; i < 5; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }

        System.out.println(max);

        int maxassume = arr[0];

        // second largest

        int secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) { // 12 3 45

            if (arr[i] > maxassume) {

                secondmax = maxassume;
                maxassume = arr[i];

            } else {
                if (arr[i] > secondmax && arr[i] != maxassume) {
                    secondmax = arr[i];
                }
            }

        }

        System.out.println(secondmax);
    }

}
