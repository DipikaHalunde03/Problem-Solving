import java.util.Scanner;

public class rightrotatebyn {
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

        int temp[] = new int[size]; // 1 2 3 4 5 size=5

        for (int i = size - pos; i < size; i++) // 3 ,4 insert in temporarry
        {
            temp[i - size + pos] = arr[i];
        }
        // shifting numbers

        // for (int i = size - 1; i >= pos; i--) {
        // arr[i] = arr[i - pos];

        // }
        // another approch

        for (int i = size - pos - 1; i >= 0; i--)// 2 , 1 ,0
        {
            arr[i + pos] = arr[i];

        }

        // add temp to original array

        for (int i = 0; i < pos; i++) {
            arr[i] = temp[i];

        }
        // printing whole array now

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        // another approach reverse the both sub-array and then whole array

    }

}
