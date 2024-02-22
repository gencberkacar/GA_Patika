package Cin_Zodyagi;
import java.util.Scanner;
public class Main18 {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        //veri girişi sağlanıyor
        System.out.print("Doğduğunuz yılı giriniz : ");
        int yil = veri.nextInt();
        //veri 12'ye bölünüyor ve sonuç değişkenine atanıyor
        int sonuc = yil % 12;

        //sonuca göre burç bulunup çıktı veriliyor aksi durumda hata mesajı çıkıyor
        switch(sonuc){
            case 0 :
                System.out.print("Maymun");
                break;
            case 1:
                System.out.print("Çin Zodyağı Burcunuz: Horoz");
                break;
            case 2:
                System.out.print("Çin Zodyağı Burcunuz: Köpek");
                break;
            case 3:
                System.out.print("Çin Zodyağı Burcunuz: Domuz");
                break;
            case 4:
                System.out.print("Çin Zodyağı Burcunuz: Fare");
                break;
            case 5:
                System.out.print("Çin Zodyağı Burcunuz: Öküz");
                break;
            case 6:
                System.out.print("Çin Zodyağı Burcunuz: Kaplan");
                break;
            case 7:
                System.out.print("Çin Zodyağı Burcunuz: Tavşan");
                break;
            case 8:
                System.out.print("Çin Zodyağı Burcunuz: Ejderha");
                break;
            case 9:
                System.out.print("Çin Zodyağı Burcunuz: Yılan");
                break;
            case 10:
                System.out.print("Çin Zodyağı Burcunuz: At");
                break;
            case 11:
                System.out.print("Çin Zodyağı Burcunuz: Koyun");
                break;
            default:
                System.out.print("Hatalı Giriş Yaptınız");


        }

    }
}
