package Switch_Case_Yapisi;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args){
        Scanner veri = new Scanner(System.in);
        System.out.print("Günü Sayı olarak giriniz: ");
        int day = veri.nextInt();

        switch (day) {
            case 1:
                System.out.print("Bugün Pazartesidir.");
                break;
            case 2:
                System.out.print("bugün salıdır");
                break;
            case 3:
                System.out.print("bugün çarşambadır");
                break;
            case 4:
                System.out.print("bugün perşembedir");
                break;
            case 5:
                System.out.print("bugün cumadır");
                break;
            case 6:
                System.out.print("bugün cumartesidir");
                break;
            case 7:
                System.out.print("bugün pazardır");
                break;
            default:
                System.out.print("1-7 Arasında değer giriniz");


        }
    }
}
