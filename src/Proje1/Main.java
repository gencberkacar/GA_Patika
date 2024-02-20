import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Degiskenleri Atadık
         int mat,fizik,kimya,turkce,tarih,muzik;

         //Scanner sınıfımızı tanımladık
        Scanner deger = new Scanner(System.in);

        //Kullanıcıdan Mat degerini aldık
        System.out.print("Matematik Notunuz: ");
        mat = deger.nextInt();

        //Kullanıcıdan Fizik degerini aldık
        System.out.print("Fizik Notunuz: ");
        fizik = deger.nextInt();

        //Kullanıcıdan Kimya degerini aldık
        System.out.print("Kimya Notunuz: ");
        kimya = deger.nextInt();

        //Kullanıcıdan Turkce degerini aldık
        System.out.print("Türkçe Notunuz: ");
        turkce = deger.nextInt();

        //Kullanıcıdan Tarih degerini aldık
        System.out.print("Tarih Notunuz: ");
        tarih = deger.nextInt();

        //Kullanıcıdan Müzik degerini aldık
        System.out.print("Müzik Notunuz: ");
        muzik = deger.nextInt();

        //Derslerin Toplamani toplam değişkenine atadık
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

        //toplam Değişkenini Toplam ders sayısına bölüm ortalama değişkenine atadık
        double ortalama = toplam / 6.0;

        //Ortalamayı yazdırdık
        System.out.println("Ortalamanız : " + ortalama);


    }

}