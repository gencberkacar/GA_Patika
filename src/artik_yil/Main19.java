package artik_yil;
import java.util.Scanner;
public class Main19 {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        //yıl verisini alıp yıl degiskenine atadık
        System.out.print("Yılı giriniz: ");
        int yil = veri.nextInt();

        //kontrolleri sağlayıp çıktıyı verdik
        
        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}