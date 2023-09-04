package Src;

import java.util.Scanner;


import java.util.Scanner;


public class U {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0, mul = 1;
        while (a != 0) {
            sum += a % 10 * mul;
            a = a / 10;
            mul *= 8;
        }
        System.out.println(sum);
    }
}
