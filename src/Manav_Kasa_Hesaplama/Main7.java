package Manav_Kasa_Hesaplama;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        // Meyve fiyatları
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;
        double armutKilo,domatesKilo,elmaKilo,muzKilo,toplamTutar,patlicanKilo;

        // veri nesnesi oluşturuldu
        Scanner veri = new Scanner(System.in);

        // Kullanıcıdan meyve miktarlarını al
        System.out.print("Armut Kaç Kilo? : ");
         armutKilo = veri.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
         elmaKilo = veri.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
         domatesKilo = veri.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
         muzKilo = veri.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
         patlicanKilo = veri.nextDouble();

        // Toplam tutarı hesapla
         toplamTutar = armutFiyat * armutKilo + elmaFiyat * elmaKilo + domatesFiyat * domatesKilo + muzFiyat * muzKilo + patlicanFiyat * patlicanKilo;

        // Sonucu yazdır
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
    }
}