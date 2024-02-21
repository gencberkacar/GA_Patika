package Hesap_Makinesi;

import java.util.Scanner;
public class Main11 {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);

        //Birinci veriyi aldık
        System.out.print("birinci veriyi giriniz: ");
        int n1 = veri.nextInt();

        //ikinci veriyi aldık
        System.out.print("ikinci veriyi giriniz: ");
        int n2 = veri.nextInt();

        //İşlemin Seçimini Yaptırıp seçim değişkenine atadık
            System.out.println("1-Toplama\n 2-Çıkarma\n 3-Çarma\n 4-Bölme");
            System.out.print("Seçiminizi Yapınız : ");
            int Secim = veri.nextInt();

        //İşlem seçimine göre sayıları işleme aldık
        switch (Secim){
            case 1:
                System.out.println("Çıkarma İşleminin Souncu : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma İşleminin Souncu : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpam İşleminin Sonucu :" + (n1 * n2));
                break;

            //eğer bölme işleminde n2 değerine 0 girilirse tekrardan değer alması için yönlendirme yaptım
            case 4:
                if (n2 == 0) {
                    System.out.print("Bölme işleminde ikinci veriyi 0'dan farklı bir değer giriniz: ");
                    n2 = veri.nextInt();
                    if (n2 == 0) {
                        System.out.print("0 dan farklı bir Değer Girmediğiniz İçin İşleminiz sonlandırılmıştır.");
                    }
                    else {
                        System.out.println("Bölme İşleminin Sonucu :" + (n1 / n2));
                    }
                }
                break;
            default:
                System.out.print("1-4 Arasında değer girmediğiniz için işleminiz iptal sonlandırılmıştır");
        }
    }
}