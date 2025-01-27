package DSA;

import java.util.Scanner;

public class Bubblesort {
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

        bubble1(arr, size);

        System.out.println("after sort");
        for (int i = 0; i < size; i++) {

            System.out.print(+arr[i] + " ");
        }
    }

    private static int bubble1(int arr[], int n) {

        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j <= n - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        return 0;

    }

}
