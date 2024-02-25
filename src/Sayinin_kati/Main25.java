package Sayinin_kati;

import java.util.Scanner;

public class Main25 {

    public static void main(String[] args){
    Scanner veri = new Scanner(System.in);
        System.out.println("Bir deger giriniz : ");
       int deger = veri.nextInt();

        for (int sayi = 0; sayi <= deger; sayi++){

            int k = 1;
            int k2 = 1;
            for (int i = 0; i < sayi; i++) {
                k *= 4;
                k2 *= 5;
            }
            System.out.println("Bu Sayının 4 ile Kuvveti = " + k + " Sayının 5 ile kuvveti: " + k2);
            }
        }
    }


