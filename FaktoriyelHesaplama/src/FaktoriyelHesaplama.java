/*
Soru: Girilen sayının faktöriyelini hesaplayan programın kodlarını yazınız.
 */

import java.util.Scanner;

public class FaktoriyelHesaplama {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen faktöriyelini almak istediğiniz bir sayı giriniz.");
        int sayi = klavye.nextInt();
        int carpim = 1;

        for (int i = 1; i <= sayi; i++) {
        carpim*=i;
        }
        System.out.println(sayi+" sayısının faktöriyeli : "+ carpim);

    }
}
