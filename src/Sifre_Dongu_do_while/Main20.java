package Sifre_Dongu_do_while;
import java.util.Scanner;
public class Main20 {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);

        boolean sifredogru = true;

        do {
            System.out.print("Sifrenizi giriniz: ");
            int sifre = veri.nextInt();
            if (sifre == 123) {
                System.out.println("sifreniz dogrudur");
                sifredogru = false;
            } else {
                System.out.println("şifreniz yanlıştır");
            }

        }
        while (sifredogru);


    }
}
