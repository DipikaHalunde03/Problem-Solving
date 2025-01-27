import java.util.Scanner;

public class longest_subarray_ksum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // int maxlen = 0;

        // for (int i = 0; i < n; i++) {
        // int sum = 0;
        // for (int j = i + 1; j < n; j++) {

        // sum = sum + arr[j];
        // if (sum == k) {
        // maxlen = Math.max(maxlen, j - i + 1);

        // }

        // }
        // }

        // System.out.println(maxlen);

        // better approach 2n using two pointer

        int maxlen = 0;
        int left = 0;
        int right = 0;
        int sum = arr[0];

        while (right < n) {

            while (sum > k && left <= right) {
                sum = sum - arr[left];
                left++;

            }

            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);

            }
            right++;
            if (right < n)
                sum = sum + arr[right];

        }

        System.out.println(maxlen);
    }

}
