package DSA;

import java.util.Scanner;

public class insertion {
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

        insertionsort(arr, size);

        System.out.println("after sort");
        for (int i = 0; i < size; i++) {

            System.out.print(+arr[i] + " ");
        }
    }

    private static void insertionsort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int k;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];

                    for (k = i; k > j; k--) {
                        arr[k] = arr[k - 1];
                    }

                    arr[k + 1] = temp;

                }

            }
        }

    }

}
