package medium_array;

import java.util.Scanner;

public class stock_and_buy_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prices[] = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();

        }
        // we have to buy the stock with minimal amount and sell it with maximum amount
        // first buy then sell

        int min = prices[0];
        // int profit = 0;
        int max = 0;

        for (int i = 1; i < n; i++) {

            max = Math.max(prices[i] - min, max);

            min = Math.min(min, prices[i]);

        }

        System.out.println(max);

    }

}
