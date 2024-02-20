package Proje2;

public class Main2

{
    public static void main(String[] args) {

        int a = 6, b = 1, c = 9;
        boolean kosul1 = a > b;
        boolean kosul2 = a >= c;
        boolean sonuc = kosul1 || kosul2;
        boolean sonuc2 = kosul1 && kosul2;
        boolean sonuc3 = !((kosul1 || kosul2));
        String str = sonuc ? "Doğru" : "Yanlış";

        System.out.println(str);
    }

}
