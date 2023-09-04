package Src;

import java.util.Arrays;
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            int[] arr = new int[b];
            for (int j = 0; j < b; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int max = maxNum(arr[0], a) > maxNum(arr[b - 1], a) ? maxNum(arr[0], a) : maxNum(arr[b - 1], a);
            int min = arr[0];
            for (int j = 1; j < b; j++) {
                if (minNum(min, a) < minNum(arr[j], a)) {
                    min = arr[j];
                }
            }
            min = minNum(min, a);
            System.out.println(min + " " + max);
        }
    }

    private static int maxNum(int n, int lenth) {
        if (n > lenth - n) {
            return n;
        }
        return lenth - n;
    }

    private static int minNum(int n, int lenth) {
        if (n > lenth - n) {
            return lenth - n;
        }
        return n;
    }


}