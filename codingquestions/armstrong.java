
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        int num1;

        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();

        int num2;

        num2 = sc.nextInt();

        isarmstrong(num1, num2);

    }

    private static void isarmstrong(int num1, int num2) {

        for (int i = num1; i <= num2; i++) {

            int temp = i;
            int lengthofi = lenorder(i);
            int armstrong = 0;

            while (temp != 0) {

                int digit = temp % 10;
                armstrong = (int) (armstrong + Math.pow(digit, lengthofi));
                temp = temp / 10;
            }

            if (i == armstrong) {
                System.out.println(+i + " number is armstrong ");
            }

        }

    }

    private static int lenorder(int x) {
        int count = 0;
        while (x != 0) {

            count = count + 1;

            x = x / 10;

        }
        return count;

    }

}