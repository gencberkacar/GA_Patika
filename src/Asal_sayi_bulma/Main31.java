package Asal_sayi_bulma;

public class Main31 {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {

            boolean asal = true;

            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

