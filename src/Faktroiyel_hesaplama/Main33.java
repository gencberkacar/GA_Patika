package Faktroiyel_hesaplama;
import java.util.Scanner;
public class Main33 {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);

        int n, total = 1;

        System.out.print("Bir Sayi Giriniz : ");
        n = veri.nextInt();

        for (int i= 1; i<= n; i++) {
            total *= i;
        }
        System.out.println("Sayınızın " + n + ". Faktöriyeli : " + total);
    }
}