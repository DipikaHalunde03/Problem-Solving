
import java.io.*;
import java.util.*;

public class maxsum_k_pair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + k + 1; j < n; j++) { // Ensure indices differ by at least k + 1
                int sum = arr[i] + arr[j];
                maxSum = Math.max(sum, maxSum);
            }
        }

        System.out.println(maxSum);

    }

}
