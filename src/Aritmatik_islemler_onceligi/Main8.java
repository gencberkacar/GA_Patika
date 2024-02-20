package Aritmatik_islemler_onceligi;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        //değişkenleri tanımladık
        int a,b,c,sonuc;
        // Kullanıcıdan verileri alıyoruz
        Scanner veri = new Scanner(System.in);
        System.out.print("a sayısını giriniz: ");
         a = veri.nextInt();
        System.out.print("b sayısını giriniz: ");
         b = veri.nextInt();
        System.out.print("c sayısını giriniz: ");
         c = veri.nextInt();

        // İşlem sırasına göre hesaplatıyoruz
         sonuc = a + b * c - b;

        // Sonucu ekrana yazdırıyoruz
        System.out.println("İşlemin sonucu: " + sonuc);

    }
}
