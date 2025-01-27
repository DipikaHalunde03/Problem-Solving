//time complexity n sq.

import java.util.Arrays;
import java.util.Scanner;

public class frequencyelement {
    public static void main(String[] args) {

        int size;

        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        frequencycount(arr, size);
    }

    static void frequencycount(int arr[], int size) {

        boolean visited[] = new boolean[size];

        Arrays.fill(visited, false);

        for (int i = 0; i < size; i++) {

            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < size; j++) {

                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;

                }
            }
            System.out.println(+arr[i] + " : " + count);

        }

    }

}
