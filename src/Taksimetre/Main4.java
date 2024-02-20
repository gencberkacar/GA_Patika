package Taksimetre;
import java.util.Scanner;
public class Main4 {
 public static void main(String[] args) {
  double mesafe,acilisUcreti,kmBasinaUcret,minOdenecekTutar,taksimetreTutari;
  // Scanner nesnesi oluşturuldu
  Scanner veri = new Scanner(System.in);

  // Kullanıcıdan gidilen mesafeyi (KM) al
  System.out.print("Gidilen mesafeyi (KM) girin: ");
   mesafe = veri.nextDouble();

  // Taksimetre açılış ücreti
   acilisUcreti = 10.0;

  // Taksimetre KM başına ücret
   kmBasinaUcret = 2.20;

  // Minimum ödenecek tutar
   minOdenecekTutar = 20.0;

  // Taksimetre tutarını hesapla
   taksimetreTutari = acilisUcreti + (mesafe * kmBasinaUcret);

  // Eğer taksimetre tutarı minimum ödenecek tutardan küçükse, taksimetre tutarını minimum ödenecek tutara eşitle
  taksimetreTutari = (taksimetreTutari < minOdenecekTutar) ? minOdenecekTutar : taksimetreTutari;

  // Sonucu yazdır
  System.out.println("Taksimetre Tutarı: " + taksimetreTutari + " TL");
 }
}