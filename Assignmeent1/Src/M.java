package Src;


import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = 0;
            for (int j = 0; j < n; j++) {
                int temp = sc.nextInt();

                if (temp == 0) {
                    x++;
                }
                if (temp == 255 && x == 1) {
                    count++;
                }


            }
        }
        System.out.println(count);
    }
}
