package Java_Datatypes;

import java.util.Scanner;

import java.util.Scanner;


class Solution {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");

                System.out.println((x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) ? "* byte" : "");
                System.out.println((x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) ? "* short" : "");
                System.out.println((x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) ? "* int" : "");
                System.out.println((x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) ? "* long" : "");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}