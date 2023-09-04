package Src;


import java.util.Scanner;

public class W {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int n = s2.length();
        if (s1.length() < s2.length()) {
            System.out.println(0);
            return;
        }
        while (s2.length() < s1.length()) {
            s2 += "0";
        }

        String result = "";
        while (s2.length() >= n) {

            int count = 0;
            while (s1.length() > s2.length() || (s1.length() == s2.length() && s1.compareTo(s2) >= 0)) {
                s1 = sub(s1, s2);
                count++;

            }
            result += count;
            s2 = s2.substring(0, s2.length() - 1);
        }
        result = result.replaceFirst("^0*", "");
        System.out.println(result);

    }

    public static String sub(String s1, String s2) {
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
            if (c1[i] - flag - '0' >= 0) {
                temp = "" + (int) (c1[i] - flag - '0') + temp;
                flag = 0;
            } else {
                temp = "" + (int) (10 + c1[i] - flag - '0') + temp;
                flag = 1;
            }
            i--;
        }
        temp = temp.replaceFirst("^0*", "");
        return temp;
    }
}

