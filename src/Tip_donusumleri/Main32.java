package Tip_donusumleri;
import java.util.Scanner;
public class Main32 {
    public static void main(String[] args) {

    Scanner veri = new Scanner(System.in);

    //değişkenleri tanımladık
    int tamSayi;
    double ondalikSayi;

    //veri girişi yaptırdık
    System.out.print("Bir Tam Sayi Giriniz : ");
    tamSayi = veri.nextInt();
    System.out.print("Bir Ondalıklı Sayı Giriniz : ");
    ondalikSayi = veri.nextDouble();

    //işleme aldık ve yazdırdık
    double a = (double) tamSayi;
    int b = (int) ondalikSayi;

    System.out.print(a + "\n" + b);
}
}