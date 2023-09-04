package Src;


import java.util.Arrays;
import java.util.Scanner;

public class Y {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s1 = sc.next();
            String s2 = sc.next();
            if (s1.length() != s2.length()) {
                System.out.println("NO");
                break;
            }
            int len = s1.length();
            int[] a1 = new int[26];
            int[] a2 = new int[26];
            for (int i = 0; i < 26; i++) {
                a1[i] = 0;
                a2[i] = 0;
            }
            for (int i = 0; i < len; i++) {
                a1[s1.charAt(i) - 'A']++;
                a2[s2.charAt(i) - 'A']++;
            }
            boolean flag = true;
            Arrays.sort(a1);
            Arrays.sort(a2);
            for (int i = 0; i < 26; i++) {
                if (a1[i] != a2[i]) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("YES");
            }

        }
    }


}




