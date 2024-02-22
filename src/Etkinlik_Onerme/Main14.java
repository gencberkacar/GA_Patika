package Etkinlik_Onerme;
import java.util.Scanner;
public class Main14 {
    public static void main(String[] args) {
        int sicaklik , x;
        Scanner veri = new Scanner(System.in);
        System.out.print("Sıcaklık degeri giriniz : ");
        sicaklik = veri.nextInt();

        if (sicaklik < 5) {
            x = 1;
        } else if (sicaklik >= 5 && sicaklik < 15) {
            x = 2;
        } else if (sicaklik >= 15 && sicaklik < 25) {
            x = 3;
        } else {
            x = 4;
        }
    switch (x){
        case 1:
            System.out.print("Kayak Yapmaya Gidebilirsin");
            break;
        case 2:
            System.out.print("Sinemaya Gidebilirsin");
            break;
        case 3:
            System.out.print("Pikniğe Gidebilirsin");
            break;
        case 4:
            System.out.print("Yüzmeye Gidebilirsin");
            break;
        default:
            System.out.print("Sanırım Evde Oturmak İstiyorsun ^^");
    }

}
}