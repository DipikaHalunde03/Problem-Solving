import java.util.Scanner;

public class leftrotatebyn {
    public static void main(String[] args) {
        int size;

        Scanner sc = new Scanner(System.in);
        int pos;

        size = sc.nextInt();
        pos = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        if (pos > size) {

            System.out.println("enter valid position");
        } else {
            pos = pos % size; // 2
            int temp[] = new int[size];
            for (int i = 0; i < pos; i++) // 0 1
            {
                temp[i] = arr[i]; // 3 4

            }

            for (int i = 0; i < size - pos; i++) // 0 1 2
            {
                arr[i] = arr[i + pos]; // 5 6 7
            }

            for (int i = size - pos; i < size; i++) // 3 4
            {
                arr[i] = temp[i - size + pos];// 0,1
            }

        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // 3 4 5 6 7
        // 5 6 7 3 4
        // another approach reverse the both sub-array and then whole array

    }

}
