package Harmonik_sayi;
import java.util.Scanner;
public class Main35 {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);

        int n;
        double toplam = 0.0;

        System.out.print("Bir sayı giriniz : ");
        n = veri.nextInt();

        for (int i = 1; i <= n; i++) {
            toplam += 1.0 / i;
        }
        System.out.println("Sayınızın Harmonik Serisi : " + toplam);
    }
}

