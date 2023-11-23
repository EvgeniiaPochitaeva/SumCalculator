package sum.calculator;

import java.util.Scanner;

public class SumCalculator {

    public static void scanData() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("An inaccessible value of zero or less than zero was entered.");
        }
        int total = 0;
        for (int i = 0; i <=n ; i++) {
            total += i;
        }
        return total;              

    }

}
