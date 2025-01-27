import java.util.Scanner;

public class maxlensubarray_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        int len = 0;

        for (int i = 0; i < size; i++) {
            int sum = 0;

            for (int j = i; j < size; j++) {
                sum = sum + arr[j];

                if (sum == k) {
                    len = Math.max(len, j - i + 1);

                }

            }
        }

        System.out.println(len);

    }

}
