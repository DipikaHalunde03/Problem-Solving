import java.util.Scanner;

public class finidingmin_max {
    public static void main(String[] args) {
        int size;

        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        getminmax(arr, size);

    }

    // 3 5 1 7 2

    /**
     * @param arr
     * @param size
     */

    // private static void getminmax(int arr[], int size) {
    // int min = arr[0];
    // int max = arr[1];

    // for (int i = 2; i < size; i++) {
    // if (arr[0] > arr[1]) {
    // min = arr[1];
    // max = arr[0];

    // if (arr[i] > max) { in this function we compare each element with min and max
    // hence it creates 4 comparisions for two elements
    // max = arr[i];
    // }
    // else if (arr[i] < min) {
    // min = arr[i];

    // }

    // } else {

    //

    // if (arr[i] > max) {
    // max = arr[i];
    // } else if (arr[i] < min) {
    // min = arr[i];

    // }

    // }

    // }
    // System.out.println(+min);
    // System.out.println(+max);

    // } 2,6,7,8,1

    private static void getminmax(int arr[], int size) {
        int min = arr[0];
        int max = arr[1];

        if (arr[0] > arr[1]) {
            min = arr[1];
            max = arr[0];
        }

        for (int i = 2; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > max) { // here we comare 2 numbers 3 times only coz first we decide i ,i+1 number
                                    // comaparasion
                    max = arr[i];

                }
                if (arr[i + 1] < min) {
                    min = arr[i + 1];
                }

            } else {
                if (arr[i + 1] > max) {
                    max = arr[i + 1];

                }
                if (arr[i] < min) {
                    min = arr[i];
                }

            }

        }

        System.out.println("smallest number is " + min);
        System.out.println("largest number is " + max);
    }
}
