import java.util.HashMap;
import java.util.Scanner;

public class two_sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int maxlen = 0;

        // for (int i = 0; i < n; i++) {

        // for (int j = i + 1; j < n; j++) {
        // int val = 0;
        // val = arr[i] + arr[j];

        // if (val == sum) {
        // System.out.println(arr[i] + " " + arr[j]);

        // }

        // }
        // }

        // better approach using hashmap to store element along with index

        // approach using two pointer

        int left = 0;
        int right = n - 1;
        // 1 2 3 4 5
        while (left < right) {

            int val = arr[left] + arr[right];

            if (val == sum) {
                System.out.println("yes");

            } else if (val < sum) {
                left++;
            } else
                right--;

        }

        System.out.println("no");

    }

}
