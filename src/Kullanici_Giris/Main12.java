package Kullanici_Giris;
import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        //değişkenleri tanımladık
        String id, pw, secim;

        //kullanıcı ad verisini aldık
        System.out.print("Kullanici adınızı giriniz: ");
        id = veri.nextLine();

        //şifre verisini aldık
        System.out.print("Şifrenizi giriniz: ");
        pw = veri.nextLine();

        if (id.equals("patika") && pw.equals("1234")) {
            System.out.print("Başarıyla Giriş Yaptiniz");
        }
        else {
            //girilen şifre 1234 den farklıysa şifre sıfırl
            System.out.println("Girilen Şifre Hatalıdır, Şifrenizi Sıfırlamak İster misiniz? (Evet/Hayır):");
            secim = veri.nextLine();

            //Hayır dediği için sistem sonlandı
            if (secim.equals("Hayır")) {
                System.out.print("Şifrenizi Hatırladığınız Zaman Görüşmek Üzere :)");
            }
            //evet dediği için yeni şifre verisi istendi eğer güncel şifreyle aynısını girerse hata mesajı ekrana yazdırıldı
            if (secim.equals("Evet")) {
                System.out.print("Yeni Şifrenizi Giriniz: ");
                pw = veri.nextLine();
                if (pw.equals("1234")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }
    }
}



