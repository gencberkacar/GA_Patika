import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        //  veri nesnesi oluşturuldu
        Scanner veri = new Scanner(System.in);
        double yaricap,aci,PI,alan;

        // Kullanıcıdan dairenin yarı çapını ve merkez açısının ölçüsü alındı
        System.out.print("Dairenin yarı çapını girin: ");
         yaricap = veri.nextDouble();

        System.out.print("Merkez açısının ölçüsünü girin: ");
         aci = veri.nextDouble();

        // Pi sayısını sabit olarak tanımlandı
         PI = 3.14;

        // Alanı hesapla
         alan = (PI * yaricap * yaricap * aci) / 360;

        // Sonucu yazdır
        System.out.println("Daire Diliminin Alanı: " + alan);
    }
}