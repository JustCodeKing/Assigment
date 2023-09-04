package Src;

import java.util.Scanner;


public class V {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int i = c1.length - 1;
        int j = c2.length - 1;
        int flag = 0;
        String temp = "";
        while (i >= 0 && j >= 0) {

            if (c1[i] - c2[j] - flag >= 0) {
                temp = "" + (int) (c1[i] - c2[j] - flag) + temp;
                flag = 0;
            } else {
                temp = "" + (int) (10 + c1[i] - c2[j] - flag) + temp;
                flag = 1;
            }
            i--;
            j--;
        }
        while (i >= 0) {
            if (c1[i] - flag >= 0) {
                temp = "" + (int) (c1[i] - flag - '0') + temp;
                flag = 0;
            } else {
                temp = "" + (int) (10 + c1[i] - flag - '0') + temp;
                flag = 1;
            }
            i--;
        }
        System.out.println(temp);
    }
}
