package Src;

import java.util.Scanner;


public class T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String temp = "";
        while (a != 0) {
            temp = "" + a % 8 + temp;
            a /= 8;
        }
        System.out.println(temp);
    }
}