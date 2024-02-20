package KDV_Tutarı_Hesaplama;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // KDV oranları
        double kdvOrani1 = 0.18;
        double kdvOrani2 = 0.08;
        double tutar,kdvOrani,kdvliFiyat,kdvTutari;

        // Kullanıcıdan veri alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen tutarı girin: ");
         tutar = input.nextDouble();

        // KDV oranını belirleniyor
         kdvOrani = (tutar > 0 && tutar <= 1000) ? kdvOrani1 : kdvOrani2;

        // KDV'li fiyatı hesaplıyoruz
         kdvliFiyat = tutar * (1 + kdvOrani);

        // KDV tutarını hesaplıyoruz
         kdvTutari = kdvliFiyat - tutar;

        // Sonuçları yazdıralım
        System.out.println("KDV Oranı: %" + (kdvOrani * 100));
        System.out.println("KDV'li Fiyat: " + kdvliFiyat + " TL");
        System.out.println("KDV Tutarı: " + kdvTutari + " TL");
    }
}