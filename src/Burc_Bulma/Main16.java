package Burc_Bulma;
import java.util.Scanner;
public class Main16 {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);

        //veri girişini yaptırdık
        System.out.print("Doğum gününüzün gününü giriniz: ");
        int gun = veri.nextInt();
        System.out.print("Doğum ayınızın sırasını giriniz: ");
        int ay = veri.nextInt();

        //veriye göre hangi burç oldugu hesaplanıyor
        if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
            System.out.println("Koç Burcu");
        } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
            System.out.println("Boğa Burcu");
        } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) {
            System.out.println("İkizler Burcu");
        } else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) {
            System.out.println("Yengeç Burcu");
        } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
            System.out.println("Aslan Burcu");
        } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
            System.out.println("Başak Burcu");
        } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
            System.out.println("Terazi Burcu");
        } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
            System.out.println("Akrep Burcu");
        } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
            System.out.println("Yay Burcu");
        } else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21)) {
            System.out.println("Oğlak Burcu");
        } else if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) {
            System.out.println("Kova Burcu");
        } else if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) {
            System.out.println("Balık Burcu");
        }
        //istenilen tarih aralığı girilmezse hata yazdır
        else {
            System.out.println("Geçersiz tarih");
        }
    }
}