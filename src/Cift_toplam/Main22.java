package Cift_toplam;

import java.util.Scanner;

public class Main22
{
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);

        int toplam = 0;
        System.out.println("Bir sayı giriniz :");

        int deger;
        do {
            deger = veri.nextInt();

            if (deger % 2 == 0 && deger % 4 == 0) {
                toplam += deger;
            }

        } while (deger % 2 != 1);

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
    }
}

