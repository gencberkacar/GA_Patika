package min_Max_Sayi_bulma;
import java.util.Scanner;
public class Main27 {


        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            int number, n, maks = 0, min = 0;

            //girilecek sayı adedini alıyoruz
            System.out.print("Kaç tane sayı gireceksiniz : ");
            number = inp.nextInt();

            //n adet sayıyı karşılaştırıp sonucu yazdırıyoruz
            for (int i = 1; i <= number; i++) {
                System.out.print(i + ". Sayıyı giriniz : ");
                n = inp.nextInt();
                if(i == 1) {
                    maks = n;
                    min = n;
                }
                if (n > maks) {
                    maks = n;
                }
                if (n < min) {
                    min = n;
                }
            }
            System.out.println("En büyük sayı : " + maks + "\nEn küçük sayı : " + min);
        }
    }

