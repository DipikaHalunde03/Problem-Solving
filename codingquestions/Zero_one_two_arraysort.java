import java.util.Scanner;

public class Zero_one_two_arraysort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 1 0 2 0 1

        // first count 0, 1, 2 elements
        // int count_0 = 0;
        // int count_1 = 0;
        // int count_2 = 0;

        // for (int i = 0; i < n; i++) {
        // if (arr[i] == 0) {
        // count_0++;
        // } else if (arr[i] == 1) {
        // count_1++;

        // } else {
        // count_2++;

        // }

        // }

        // for (int i = 0; i < count_0; i++) // 2
        // arr[i] = 0;
        // for (int i = count_0; i < count_1 + count_0; i++) // 2
        // arr[i] = 1;
        // for (int i = count_1 + count_0; i < n; i++) // 1
        // arr[i] = 2;
        // for (int i = 0; i < n; i++) {
        // System.out.println(arr[i]);
        // }

        // by dutch national algorithm

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {

                // swp with low
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;

            } else if (arr[mid] == 1) {
                // no swAP
                mid++;

            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;

                // swap with high

            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}
