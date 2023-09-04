package Src;

import java.util.Scanner;

public class K {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            int sum = 0;
            int flag = 0;
            while (a != 0 || b != 0) {
                if (a % 10 + b % 10 + flag >= 10) {
                    sum++;
                    flag = 1;
                } else {
                    flag = 0;
                }
                a /= 10;
                b /= 10;
            }
            if (sum == 0) {
                System.out.println("No carry operation.");
            } else if (sum == 1) {
                System.out.println(sum + " carry operation.");
            } else {
                System.out.println(sum + " carry operations.");
            }

        }

    }
}