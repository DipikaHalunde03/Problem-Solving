import java.util.Scanner;

public class leftrotatebyone {
    public static void main(String[] args) {
        int size;

        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                arr[i] = temp;
                break;
            }

            arr[i] = arr[i + 1];
        }

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

    }

}
