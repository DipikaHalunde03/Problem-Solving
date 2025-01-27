import java.util.Scanner;

public class fiboncci {
    public static void main(String[] args) {

        int num1;

        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();

        // int result = fiboncci(num1);
        // System.out.print(result);
        fiboncci(num1);
    }

    private static int fiboncci(int num) {
        int sum = 0;

        if (num < 2) {
            System.out.print(num);
        } else {
            System.out.println("0 , 1");
            int a = 0, b = 1, c;

            for (int i = 2; i < num; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(" , " + b);

            }

        }
        return 0;

        // if (num <= 1) {

        // return num;
        // }

        // return fiboncci(num - 1) + fiboncci(num - 2);

    }

}
