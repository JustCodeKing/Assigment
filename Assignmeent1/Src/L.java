package Src;

import java.util.Scanner;

public class L {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            double a, b;
            int c, d, e;
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextInt();
            d = sc.nextInt();
            e = sc.nextInt();
            int sum = 0;
            if (a < 4.0 || a > 10.0) {
                sum++;
            }
            if (b > 5.5 || b < 3.5) {
                sum++;
            }
            if (s.equals("male")) {
                if (c > 160 || c < 120) {
                    sum++;
                }
                if (d > 48 || d < 42) {
                    sum++;
                }

            }
            if (s.equals("female")) {
                if (c > 150 || c < 110) {
                    sum++;
                }
                if (d > 40 || d < 36) {
                    sum++;
                }
            }
            if (e > 300 || e < 100) {
                sum++;
            }
            if (sum == 0) {
                System.out.println("normal");
            }
            if (sum != 0) {
                System.out.println(sum);
            }
        }

    }
}
