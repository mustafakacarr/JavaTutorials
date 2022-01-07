/*
Kullanıcıdan boyunu(cm) ve kilosunu(kg) alıp VKİ hesaplamalarına göre ekrana çıktı verilmesi istenmektedir. Programın
kodlarını yazınız.
 */

import java.util.Scanner;

public class VucutKitleEndeksiHesaplama {

    public static void main(String[] args) {
        double boy, kilo, vki;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (cm) giriniz.");
        boy = klavye.nextInt();
        System.out.println("Lütfen kilonuzu (kg) giriniz.");
        kilo = klavye.nextInt();
        boy = boy / 100;
        vki = kilo / (boy * boy);

        if (vki < 18) {
            System.out.printf("Sonuç : ZAYIF vki: %4.2f", vki);
        } else if (vki >= 18 && vki < 25) {
            System.out.printf("Sonuç : NORMAL vki: %4.2f", vki);
        } else if (vki >= 25 && vki < 30) {
            System.out.printf("Sonuç : KİLOLU vki: %4.2f", vki);
        } else if (vki >= 30 && vki < 35) {
            System.out.printf("Sonuç : OBEZ vki: %4.2f", vki);
        } else {
            System.out.println("Sonuç : CİDDİ OBEZ vki: "+ vki);
        }
    }
}
