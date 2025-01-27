package DSA;

import java.util.Scanner;

class mergesort1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 st array size ");
        int size1 = sc.nextInt();

        int arr1[] = new int[size1];

        for (int i = 0; i < size1; i++) {

            arr1[i] = sc.nextInt();
        }
        System.out.println("enter 2nd array size ");
        int size2 = sc.nextInt();

        int arr2[] = new int[size2];

        for (int i = 0; i < size2; i++) {

            arr2[i] = sc.nextInt();
        }

        int size3 = size1 + size2;

        int arr3[] = new int[size3];

        bubblesort(arr1, size1);
        bubblesort(arr2, size2);

        int i, j, k;

        for (i = j = k = 0;;) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                k++;
                i++;

            } else {
                arr3[k] = arr2[j];
                k++;
                j++;

            }
            if (i == size1 || j == size2) {
                break;
            }
        }
        while (i <= size1 - 1) {
            arr3[k] = arr1[i];
            k++;
            i++;
        }

        while (j <= size2 - 1) {
            arr3[k] = arr2[j];
            k++;
            j++;
        }

        System.out.println("after sort");
        for (int m = 0; m < size3; m++) {

            System.out.print(+arr3[m] + " ");
        }
    }

    private static void bubblesort(int arr[], int size) {
        for (int i = 0; i <= size - 2; i++) {
            for (int j = 0; j <= size - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }
    }

}