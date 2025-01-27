import java.util.Scanner;

public class recusionmax {
    public static void main(String[] args) {

        int size;

        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(getmax(arr, size));
        System.out.println(getmin(arr, size));

    }

    private static int getmax(int arr[], int n) {
        if (n == 1) {
            return arr[0];

        }
        return Math.max(arr[n - 1], getmax(arr, n - 1));

    }

    private static int getmin(int arr[], int n) {
        if (n == 1) {
            return arr[0];

        }
        return Math.min(arr[n - 1], getmin(arr, n - 1));

    }

}
