import java.util.Scanner;

public class halfarrayascendingdescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {

            System.out.print(arr[i] + " ");
        }
        int middle = arr.length / 2;

        for (int i = 0; i < size - 1; i++) {

            for (int j = 0; j < arr.length / 2; j++) {
                if (arr[j] >= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

            for (int j = arr.length / 2; j < size - 1; j++) {
                if (arr[j] <= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }

        System.out.println("first half array in ascending order ");

        for (int i = 0; i < middle; i++) {

            System.out.println(arr[i] + " ");
        }
        System.out.println("second half array in descending order ");

        for (int i = middle; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

    }

}
