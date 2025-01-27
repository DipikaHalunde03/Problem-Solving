package DSA;

import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int flag = 0;

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }
        int element;

        System.out.println("enter lement to search ");

        element = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (element == arr[i]) {
                System.out.println("element found at position " + (i + 1));
                flag = 1;

            }
        }

        if (flag == 0) {
            System.out.println("number is not in a array");
        }
    }

}
