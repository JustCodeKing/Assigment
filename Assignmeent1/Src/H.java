package Src;

import java.util.Scanner;

public class H {

    public static int[] arr() {
        int[] arr = new int[141];
        arr[0] = 0;
        for (int i = 1; i < 141; i++) {
            arr[i] = i * i + arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = arr();

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int an = a(n);
            int money = arr[an] + (n - an * (an + 1) / 2) * (an + 1);
            System.out.println(n + " " + money);
        }


    }

    public static int a(int n) {
        int a = (int) Math.sqrt((double) n) - 1;

        while (true) {
            if (a * (a + 1) <= 2 * n && (a + 1) * (a + 2) > 2 * n) {
                return a;
            }
            a++;
        }

    }


}