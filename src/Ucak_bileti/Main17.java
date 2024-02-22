package Ucak_bileti;
import java.util.Scanner;
public class Main17 {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);

        // km yaş ve yolculuk tipi bilgileri alındı
        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = veri.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        int yas = veri.nextInt();
        System.out.print("Yolculuk tipini seçiniz (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = veri.nextInt();

        // Veri kontrolü
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        // mesafe başına ücret hesaplama
        double fiyat = mesafe * 0.10;

        // yaş indirimleri
        if (yas < 12) {
            fiyat *= 0.5; // %50 indirim
        } else if (yas >= 12 && yas <= 24) {
            fiyat *= 0.9; // %10 indirim
        } else if (yas >= 65) {
            fiyat *= 0.7; // %30 indirim
        }

        // yolculuk tipine göre indirim
        if (yolculukTipi == 2) {
            fiyat *= 0.8; // %20 indirim
            fiyat *= 2;
        }

        // Toplam fiyatı ekrana yazdır
        System.out.println("Toplam Tutar: " + fiyat + " TL");
    }
}
