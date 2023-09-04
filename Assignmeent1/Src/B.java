package Src;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < 12; i++) {
            double money = sc.nextDouble();
            sum += money;
        }
        sum /= 12;
        String s = String.format("$%.2f", sum);
        System.out.println(s);
    }

}
