/*
Soru: Dışarıdan kullanıcı tarafından tamsayı olarak girilen 10 tabanındaki sayı eğer çift ise 8 tabanına dönüştüren,
tek ise 2 tabanına dönüştüren programın kodlarını yazınız.
 */

import java.util.Scanner;

public class TabanDonusumu {

    public static void main(String[] args) {
        int kalan;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int sayi = klavye.nextInt();

        if (sayi % 2 == 0) {
            String sonuc = "";
            while (sayi != 0) {
            kalan=sayi%8;
            sayi/=8;
            sonuc+=kalan;
            }
            System.out.println("Sayının 8 tabanındaki karşılığı : "+sonuc);
        } else {
            String sonuc = "";
            while (sayi != 0) {
                kalan=sayi%2;
                sayi/=2;
                sonuc+=kalan;
            }
            System.out.println("Sayının 2 tabanındaki karşılığı : "+sonuc);
        }

    }
}
