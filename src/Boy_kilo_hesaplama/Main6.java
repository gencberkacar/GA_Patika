package Boy_kilo_hesaplama;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        //değişkenler tanımlandı
        double boy,kilo,vki;
        // Scanner nesnesi oluşturuldu
        Scanner veri = new Scanner(System.in);

        // Kullanıcıdan boy ve kilo değerlerini al
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
         boy = veri.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
         kilo = veri.nextDouble();

        // Vücut Kitle İndeksini hesapla
         vki = kilo / (boy * boy);

        // Sonucu yazdır
        System.out.println("Vücut Kitle İndeksiniz: " + vki);
    }
}