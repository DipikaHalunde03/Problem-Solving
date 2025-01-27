import java.util.Scanner;

class largestthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        int n3;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println(+n1 + " is greater ");
            } else {
                System.out.println(+n3 + "is greater ");
            }

        } else if (n2 > n3) {
            System.out.println(+n2 + "is graeter ");

        } else {
            System.out.println(+n3 + "is greater");
        }

    }
}