package Src;

import java.util.Scanner;


public class O {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        boolean flag = true;

        int max = maxO(maxNum(p), maxNum(q), maxNum(r));

        for (int k = max + 1; k <= 16; k++) {
            if (turnRight(p, k) * turnRight(q, k) == turnRight(r, k)) {
                System.out.println(k);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(0);
        }
    }

    private static long turnRight(int num, int k) {
        int n = 0;
        int a = 1;
        while (num != 0) {
            n += (num % 10) * a;
            num /= 10;
            a *= k;
        }
        return n;
    }

    private static int maxNum(int n) {
        int max = 0;
        while (n != 0) {
            if (n % 10 > max) {
                max = n % 10;
            }
            n /= 10;
        }

        return max;
    }

    private static int maxO(int a, int b, int c) {

        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }

        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }

    }

}




