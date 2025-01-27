package bentlyques;

import java.util.HashSet;
import java.util.Scanner;

public class max_sum_subarray_k {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        int maxsum = 0;

        for (int i = 0; i < size; i++) // 1 2 3 4 5
        {
            int sum = 0;

            for (int j = i; j < size; j++) {

                sum = sum + arr[j];

                if ((j - i + 1) == k) {
                    maxsum = Math.max(maxsum, sum);
                }
            }
        }

        System.out.println(maxsum);
    }

}
