package Dik_ucgen_hipotenus;
import java.util.Scanner;


public class Main3 {

    public static void main(String[] args) {
        // değişkenler tanımlandı
        double a,b,c,u,alan;
        // Scanner nesnesi oluşturuldu
        Scanner girdi = new Scanner(System.in);

        // Kullanıcıdan üçgenin kenar uzunluklarını al
        System.out.print("1. kenar uzunluğunu girin: ");
         a = girdi.nextDouble();

        System.out.print("2. kenar uzunluğunu girin: ");
         b = girdi.nextDouble();

        System.out.print("3. kenar uzunluğunu girin: ");
         c = girdi.nextDouble();

        // Yarı çevreyi hesapla (u)
         u = (a + b + c) / 2;

        // Alanı hesapla
         alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        // Sonucu yazdır
        System.out.println("Üçgenin Alanı: " + alan);
    }
}