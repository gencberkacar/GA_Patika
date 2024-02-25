package Ort_Hesaplama;

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
            Scanner veri = new Scanner(System.in);
            int sayi;
            int ort = 0;

            System.out.println("Bir Sayı Giriniz");
            sayi = veri.nextInt();

            int adet = 0;

            for (int deger = 0; deger <= sayi; deger++) {
                if (deger % 3 == 0 && deger % 4 == 0) {
                    ort += deger;
                    adet++;
                }
            }

            if (adet != 0) {
                double ortalama = (double) ort / adet;
                System.out.println("0'dan " + sayi + "'e kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
            } else {
                System.out.println("0'dan " + sayi + "'e kadar hiçbir sayı 3 ve 4'e tam bölünmüyor.");
            }
        }
    }