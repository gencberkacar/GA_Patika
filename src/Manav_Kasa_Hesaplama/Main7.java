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

        // Scanner nesnesi oluşturuldu
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan meyve miktarlarını al
        System.out.print("Armut Kaç Kilo? : ");
         armutKilo = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
         elmaKilo = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
         domatesKilo = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
         muzKilo = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
         patlicanKilo = scanner.nextDouble();

        // Toplam tutarı hesapla
         toplamTutar = armutFiyat * armutKilo + elmaFiyat * elmaKilo + domatesFiyat * domatesKilo + muzFiyat * muzKilo + patlicanFiyat * patlicanKilo;

        // Sonucu yazdır
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
    }
}