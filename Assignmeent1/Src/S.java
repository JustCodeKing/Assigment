package Src;

import java.util.Scanner;


public class S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 4 == 0) {
            if (a % 100 == 0 && a % 400 != 0 || a % 3200 == 0) {
                System.out.println("N");
            } else {
                System.out.println("Y");
            }

        } else {
            System.out.println("N");
        }
    }
}