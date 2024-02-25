package uS_sayi;
import java.util.Scanner;
public class Main26 {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);

        int ussayi = 0;
        int taban = 0;

        System.out.print("üs sayısını giriniz :");
         ussayi = veri.nextInt();

        System.out.print("taban sayısını giriniz :");
         taban = veri.nextInt();

        int sonuc = 1;
        for (int i = 0; i < ussayi; i++) {
            sonuc *= taban;

        }
        System.out.println(sonuc);
    }
}
