import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class unionofarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int arr[] = new int[size1];
        int arr1[] = new int[size2];

        HashSet<Integer> h1 = new HashSet<>();

        for (int i = 0; i < size1; i++) {
            arr[i] = sc.nextInt();

            h1.add(arr[i]);
        }

        for (int i = 0; i < size2; i++) {
            arr1[i] = sc.nextInt();

            h1.add(arr1[i]);
        }

        System.out.println("Union of both array");

        for (int i : h1) {
            System.out.print(i + " ");
        }

    }

}
