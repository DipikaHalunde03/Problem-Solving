import java.util.Scanner;

public class sumofarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;

        size = sc.nextInt();
        int arr[] = new int[size];

        sumofarray sum = new sumofarray();
        sum.arraysum(arr, size);

    }

    int arraysum(int arr[], int size) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
            sum = sum + arr[i];

        }
        System.out.println("sum of elements in array is" + sum);
        return 0;

    }

}
