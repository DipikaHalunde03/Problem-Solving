import java.util.Scanner;

public class frequencyelemnt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        int visitedarr[] = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) { // go to 1 element to end

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) { // 3 2 1 2 3
                                                       // 2 1 2 3 as js loop

                if (arr[i] == arr[j]) { // compare 3 with every 2 1 2 3
                    count = count + 1; // 3 is get equal to last 3 in j count set to 2 now
                    visitedarr[j] = visited; // 4 th pos is set to - - - -1 -1

                }
            }

            if (visitedarr[i] != visited) { // visited array: - - - - - same as arr 2 2 1 -1 -1
                                            // 1 pos is set count as it is not -1
                visitedarr[i] = count; // 2 2

            }
        }

        for (int m = 0; m < visitedarr.length; m++) {
            if (visitedarr[m] != visited && visitedarr[m] > 1) {
                System.out.println(arr[m] + " : " + visitedarr[m]); // 3: 2 2: 2 1 :1

            }

        }

    }
}
