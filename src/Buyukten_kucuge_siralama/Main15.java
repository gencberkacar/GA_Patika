package Buyukten_kucuge_siralama;
import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        int sayi1 = veri.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int sayi2 = veri.nextInt();
        System.out.print("Üçüncü Sayıyı Giriniz : ");
        int sayi3 = veri.nextInt();

        if (sayi1 >= sayi2 && sayi1 >= sayi3) {
            if (sayi2 >= sayi3) {
                System.out.println(sayi1 + ", " + sayi2 + ", " + sayi3);
            } else {
                System.out.println(sayi1 + ", " + sayi3 + ", " + sayi2);
            }
        } else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
            if (sayi1 >= sayi3) {
                System.out.println(sayi2 + ", " + sayi1 + ", " + sayi3);
            } else {
                System.out.println(sayi2 + ", " + sayi3 + ", " + sayi1);
            }
        } else {
            if (sayi1 >= sayi2) {
                System.out.println(sayi3 + ", " + sayi1 + ", " + sayi2);
            } else {
                System.out.println(sayi3 + ", " + sayi2 + ", " + sayi1);
            }
        }
    }
}
}