package medium_array;

import java.util.HashSet;
import java.util.Scanner;

public class alternate_pos_neg_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int pos[] = new int[n]; // instead of two array we can also take arraylist
        int negarray[] = new int[n];
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos[index1] = arr[i]; // 1 2 3
                index1++;

            } else {
                negarray[index2] = arr[i];// -1 -2 -3
                index2++;
            }

        }
        index1 = 0;
        index2 = 0;
        for (int i = 0; i < n / 2; i++) {
            arr[2 * i] = pos[i];

            arr[2 * i + 1] = negarray[i];

        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
