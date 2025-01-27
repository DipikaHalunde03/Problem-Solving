import java.util.Scanner;

public class missingarrayno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size = size1 - 1;

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        int result = missingnumber(arr, size);
        System.out.println(result);

    }

    public static int missingnumber(int arr[], int size) {

        for (int i = 0; i < size; i++) {
            if (arr[i] != i + 1) {

                return i + 1;

            }

        }
        return 0;

    }

}
