package Src;

import java.util.Scanner;

public class N {
    public static boolean[][] arr = new boolean[103][103];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0, len = 0;
        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < n + 2; j++) {
                arr[i][j] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int temp = sc.nextInt();
                if (temp <= 50) {
                    arr[i][j] = false;
                    s++;
                } else {
                    arr[i][j] = true;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] == false) {
                    if (arr[i + 1][j] || arr[i - 1][j] || arr[i][j + 1] || arr[i][j - 1]) {
                        len++;
                    }
                }
            }
        }
        System.out.println(s + " " + len);
    }

}
