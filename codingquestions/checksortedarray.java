import java.util.Scanner;

public class checksortedarray {
    public static void main(String[] args) {
        int size;

        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) { // 5 6 6 4 3 2 // 1 2 3 4 5
            arr[i] = sc.nextInt();
        }
        boolean result = false;

        // for (int i = 0; i < size - 1; i++) { // bruteforce
        // for (int j = 0; j < size - 1; j++) {
        // if (arr[j] <= arr[j + 1]) {
        // result = true;
        // } else {
        // result = false;
        // break;

        // }
        // }
        // }

        for (int i = 1; i < size; i++) {
            if (arr[i] >= arr[i - 1]) {
                result = true;

            } else {
                result = false;
                break;

            }
        }

        if (result) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");

        }
    }

}
