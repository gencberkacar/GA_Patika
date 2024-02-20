import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        //  veri nesnesi oluşturuldu
        Scanner veri = new Scanner(System.in);

        // Kullanıcıdan dairenin yarı çapını ve merkez açısının ölçüsü alındı
        System.out.print("Dairenin yarı çapını girin: ");
        double yaricap = veri.nextDouble();

        System.out.print("Merkez açısının ölçüsünü girin: ");
        double aci = veri.nextDouble();

        // Pi sayısını sabit olarak tanımlandı
        final double PI = 3.14;

        // Alanı hesapla
        double alan = (PI * yaricap * yaricap * aci) / 360;

        // Sonucu yazdır
        System.out.println("Daire Diliminin Alanı: " + alan);
    }
}