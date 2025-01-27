// import java.util.Scanner;

// class secondsmallest {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int smallestnum = arr[0];

//         for (int i = 0; i < size; i++) {
//             if (arr[i] < smallestnum) {
//                 smallestnum = arr[i];

//             }
//         }

//         int secondsmallest = Integer.MAX_VALUE;

//         for (int i = 0; i < size; i++) {
//             if ((arr[i] != smallestnum) && (arr[i] < secondsmallest)) {

//                 secondsmallest = arr[i];

//             }
//         }

//         System.out.println(+secondsmallest);
//     }
// }

// using sorting approch
// import java.util.Scanner;

// class secondsmallest {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();

// int arr[] = new int[size];

// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }

// for (int i = 0; i < arr.length; i++) {
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[i] >= arr[j]) {
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;

// }
// }

// // if(i==1)
// // { we save the time to sort further array as smallest elemnt at 1
// // break;
// // }
// }

// System.out.println("second smallest + number is " + arr[1]);
// System.out.println("second largest number is " + arr[arr.length - 2]);
// }
// }

// THird approch uisng inbuilt min ,max value 

import java.util.Scanner;

class secondsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // int smallestnum = Integer.MAX_VALUE;

        // int secondsmallest = Integer.MAX_VALUE;

        // for (int i = 0; i < size; i++) { // 3 4 2 6 7
        // if (arr[i] < smallestnum) {

        // secondsmallest = smallestnum; // max value 3
        // smallestnum = arr[i]; // 3 2

        // } else if (arr[i] < secondsmallest && arr[i] != smallestnum) {
        // secondsmallest = arr[i]; // 4
        // }
        // }

        // System.out.println(+secondsmallest);
        // finding second largest with optimal approach

        int largest = arr[0]; // 2 3 6 1 8 7
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];

            }

        }
        System.out.println(secondlargest);
    }
}