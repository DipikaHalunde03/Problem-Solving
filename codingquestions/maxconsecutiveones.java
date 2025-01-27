import java.util.Scanner;

public class maxconsecutiveones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }
        int maxcount = 0;
        int count = 0;

        for (int i = 0; i < size; i++) {
            // if (arr[i] == arr[i + 1]) {
            // count++;
            // }
            // if (arr[i] != arr[i + 1]) {
            // if (count > maxcount) {
            // maxcount = count;

            // }
            // count = 1;

            // }
            // if (count > maxcount) {
            // maxcount = count;
            // }

            if (arr[i] == 1) {
                count++;
            } else {

                count = 0;
            }
            if (count > maxcount) {
                maxcount = count;

            }

        }

        System.out.println(maxcount);
    }

}
