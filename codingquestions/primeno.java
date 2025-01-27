import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        if (isprime(num)) {
            System.out.println(+num + "number is prime ");
        } else {
            System.out.println(+num + "is not prime ");
        }

    }

    private static boolean isprime(int num) {
        if (num < 2) {
            return false;

        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;

                }

            }
            return true;

        }

    }

}
