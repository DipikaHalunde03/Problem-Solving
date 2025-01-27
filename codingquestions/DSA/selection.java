package DSA;

import java.util.Scanner;

public class selection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.println("before sort");
        for (int i = 0; i < size; i++) {

            System.out.print(+arr[i] + " ");
        }

        selection(arr, size);

        System.out.println("after sort");
        for (int i = 0; i < size; i++) {

            System.out.print(+arr[i] + " ");
        }
    }

    public static int selection(int arr[], int n) {

        for (int i = 0; i < n - 1; i++) { // 5 6 3 2 9
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }
        }
        return 0;

    }
}
