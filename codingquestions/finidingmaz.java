import java.util.Scanner;

public class finidingmaz {
    public static void main(String[] args) {

        int size;

        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int firstnum = arr[0];

        for (int i = 1; i < size; i++) {

            if (arr[0] < arr[i]) {
                firstnum = arr[i];

            }

        }
        System.out.println(firstnum);

    }

}
