import java.util.Scanner;

public class maximum_subarray_sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = arr[0];
        int maxsum = 0;

        for (int i = 1; i < n; i++) {

            sum = sum + arr[i];

            if (sum > maxsum) {
                maxsum = sum;

            }
            if (sum < 0) {
                sum = 0;

            }

        }

        System.out.println(maxsum);// -2, 1, -3, 4, -1, 2, 1, -5, 4

    }

}
