import java.util.HashSet;
import java.util.Scanner;

public class removeduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size]; // arraylist
        HashSet<Integer> h1 = new HashSet<>();

        for (int i = 0; i < size; i++) {
            int m = sc.nextInt();

            h1.add(m);

        }
        int index = 0;

        for (int i : h1) {
            arr[index] = i;
            index++;

        }
        for (int i = 0; i < size; i++) {

            System.out.println(arr[i]);

        }

    }

}
