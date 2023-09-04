package Src;

import java.util.Scanner;

public class R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m1 = sc.nextInt();
            int d1 = sc.nextInt();
            long m = sc.nextLong();
            int m2 = sc.nextInt();
            int d2 = sc.nextInt();
            int temp = day(m2, d2) - day(m1, d1);
            m = m * (long) Math.pow(2, temp);
            System.out.println(m);
        }
    }

    public static int day(int month, int day) {
        int[] arr = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

        return arr[month] + day;
    }

}
