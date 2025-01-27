package DSA;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int flag = 0;

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }
        int element;
        int low = 0;
        int high = size - 1;

        System.out.println("enter lement to search ");

        element = sc.nextInt();

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == element) {
                System.out.println("elemnt found at position  " + (mid + 1));
                flag = 1;
                break;

            }

            if (element < arr[mid]) {
                high = mid - 1;

            }

            if (element > arr[mid]) {
                low = mid + 1;
            }

        }
        if (flag == 0) {
            System.out.println("element is not found in array");
        }
    }

}
