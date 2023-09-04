package Src;


import java.util.Scanner;

public class Z {

    public static void main(String[] args) {
        int[] arr1 = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int[] arr2 = {0, 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] ss = s.split("/");
            int year = Integer.parseInt(ss[0]);
            int month = Integer.parseInt(ss[1]);
            int day = Integer.parseInt(ss[2]);
            int[] arr;
            if (isYear(year)) {
                arr = arr2;
            } else {
                arr = arr1;
            }
            System.out.println(arr[month] + day);
        }

    }

    public static boolean isYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

}
