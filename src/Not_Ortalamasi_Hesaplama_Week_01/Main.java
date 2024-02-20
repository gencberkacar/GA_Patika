import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner deger = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = deger.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = deger.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = deger.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = deger.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = deger.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = deger.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6.0;

        String durum = (ortalama >= 60) ? "Geçtiniz Tebrikler :)" : "Seneye Görüşürüz :)";
        System.out.println(durum);
    }
}