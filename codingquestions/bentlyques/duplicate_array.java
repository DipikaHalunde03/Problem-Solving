package bentlyques;

import java.util.HashSet;
import java.util.Scanner;

public class duplicate_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        HashSet<Integer> h1 = new HashSet<>();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }

        for (int num : arr) {
            if (!h1.add(num)) {
                System.out.println(num);
                break;

            }
        }

    }

}
