package Src;

import java.util.Scanner;

public class P {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.next();
            if (s.equals("0")) {
                break;
            }
            int len = s.length();
            int num = 0;
            int n = 2;
            for (int i = 1; i <= len; i++) {

                num += (s.charAt(len - i) - '0') * (n - 1);
                n += n;
            }
            System.out.println(num);

        }
    }


}




