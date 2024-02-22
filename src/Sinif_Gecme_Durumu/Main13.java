package Sinif_Gecme_Durumu;
import java.util.Scanner;
public class Main13 {
    public static void main(String[] args) {
    Scanner veri = new Scanner(System.in);
    int mat, fizik, turkce, kimya, muzik, x;

    //Kullanıcıdan ders notlarını alıyoruz
    System.out.print("Matematik Notunuzu Giriniz : ");
        mat = veri.nextInt();
        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = veri.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = veri.nextInt();
        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = veri.nextInt();
        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = veri.nextInt();
        x=0;
        double ort =0;
        //eğer ders notu 0 ile 100 arasında değilse o ders notunu ortalamaya dahil etmiyoruz
        if(mat >= 0 && mat <= 100) {
            ort += mat;
            x++;
        }
        if (fizik >= 0 && fizik <= 100) {
            ort += fizik;
            x++;
        }
        if (turkce >= 0 && turkce <= 100) {
            ort += turkce;
            x++;
        }
        if (kimya >= 0 && kimya <= 100) {
            ort += kimya;
            x++;
        }
        if (muzik >= 0 && muzik <= 100) {
            ort += muzik;
            x++;
        }

        // Ortalama hesaplama
        if (x > 0) {
            ort /= x;
            System.out.println("Geçerli notların ortalaması: " + ort);

            // Geçme durumu kontrolü
            if (ort >= 55) {
                System.out.println("Öğrenci dersi geçti.");
            } else {
                System.out.println("Öğrenci dersi geçemedi.");
            }
        } else {
            System.out.println("Hiç geçerli not girilmedi.");
        }
    }
}