import java.util.Scanner;

public class sumdigits {
    public static void main(String[] args) {

        // int num;
        // Scanner sc = new Scanner(System.in);

        // num = sc.nextInt();
        // int originalnum = num;

        // int sum = 0;
        // int reversenum = 0;

        // while (num != 0) {
        // int digit = num % 10;
        // sum = sum + digit;
        // reversenum = reversenum * 10 + digit;

        // num = num / 10;

        // }

        // System.out.println("sum of digits of number is " + sum);
        // System.out.println("reverse of number is " + reversenum);
        // if (reversenum == originalnum) {
        // System.out.println("number is palindrome ");
        // } else {
        // System.out.println("number is not palindrome ");

        // }

        int n = 3;

        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = n - 1; j >= 0; j--) {
                System.out.println(" ");
            }
            int count = 0;

            for (int k = i + count; k > i; k++) {
                System.out.print("*");
            }

        }

    }

}
