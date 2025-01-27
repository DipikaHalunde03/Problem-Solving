import java.util.Scanner;

public class uniquenumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }
        // int visited[] = new int[size];
        // int visit = -1;

        // for (int i = 0; i < size; i++) {
        // int count = 1;

        // for (int j = i + 1; j < size; j++) {
        // if (arr[i] == arr[j]) {
        // count++;
        // visited[j] = visit;

        // }

        // }
        // if (visited[i] != visit) {
        // visited[i] = count;

        // }

        // }
        // for (int i = 0; i < size; i++) {

        // if (visited[i] != -1 && visited[i] < 2) {
        // System.out.println(arr[i]);
        // }
        // }

        // second approach using hash array

        // int max = 0;

        // for (int i = 0; i < size; i++) {
        // max = Math.max(max, arr[i]);

        // }
        // // creating array to store frequency

        // int hash[] = new int[max + 1];

        // for (int i = 0; i < size; i++) {
        // hash[arr[i]]++;

        // }

        // for (int i = 0; i < size; i++) {
        // if (hash[arr[i]] == 1) {
        // System.out.println(arr[i]);
        // }

        // }

        // 3rd approach is xor xor wth sme number is 0 and with 0 is number
        int xor = 0;

        for (int i = 0; i < size; i++) {

            xor = arr[i] ^ xor;

        }
        System.out.println(xor);

    }

}
