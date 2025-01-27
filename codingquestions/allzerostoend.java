import java.util.Scanner;

public class allzerostoend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = size - 1;
        // 1 0 2 0 3
        while (start < end) {

            if (arr[start] == 0 && arr[end] != 0) { // 1 3 2 0 0

                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;

            }
            if (arr[start] != 0) { // 0
                start++;
            }
            if (arr[end] == 0) {
                end--;
            }
        }

        for (int i = 0; i < size; i++) {

            System.out.print(arr[i] + " ");
        }
    }

}
