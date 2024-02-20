package Aritmatik_islemler_onceligi;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        // Kullanıcıdan verileri alıyoruz
        Scanner veri = new Scanner(System.in);
        System.out.print("a sayısını giriniz: ");
        int a = veri.nextInt();
        System.out.print("b sayısını giriniz: ");
        int b = veri.nextInt();
        System.out.print("c sayısını giriniz: ");
        int c = veri.nextInt();

        // İşlem sırasına göre hesaplatıyoruz
        int sonuc = a + b * c - b;

        // Sonucu ekrana yazdırıyoruz
        System.out.println("İşlemin sonucu: " + sonuc);

    }
}
