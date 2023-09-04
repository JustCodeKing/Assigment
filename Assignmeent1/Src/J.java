package Src;

import java.util.Scanner;

public class J {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (b - a > 0) {
                System.out.println(b - a);
            } else {
                System.out.println(a - b);
            }
        }
    }
}
