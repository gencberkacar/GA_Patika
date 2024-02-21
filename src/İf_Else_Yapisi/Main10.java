package İf_Else_Yapisi;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        System.out.print("Gün İçin Sayisal Veri Giriniz:");
        int day = veri.nextInt();

        if(day == 1){
            System.out.print("Bugün Pazartesidir");

        }
        else if(day == 2) {
            System.out.print("Bugün Salı");

        }else if(day == 3){
            System.out.print("Bugün Çarşambadır");

        } else if (day == 4) {
            System.out.print("Bugün Perşembe");

        } else if (day == 5) {
            System.out.print("Bugün Cuma");

        } else if (day == 6) {
            System.out.print("Bugün Cumartesi");

        } else if (day == 7) {
            System.out.print("Bugün Pazar");

        }
        else {
            System.out.print("1-7 Arasında Değer Giriniz");
        }
    }

}
