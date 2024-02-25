package Ters_ucgen;
import java.util.Scanner;

public class Main30 {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);

        int n;

        //sayı verisini aldık
        System.out.print("Bir Sayı Giriniz : ");
        n = veri.nextInt();

        //girilen sayıyı ters üçgen olacak şekilde azaltarak yazdırdık
        for (int i = 0; i < n ; i++) {

            for (int k = 0; k <= i - 1; k++) {
                System.out.print(" ");
            }

            for (int j = (2 * n) - 1; j >= (2 * i) + 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

