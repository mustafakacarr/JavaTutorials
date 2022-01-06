/*
Soru: Kullanıcı tarafından girilen 4 basamaklı sayıyı metne dönüştüren programın kodunu yaıznız.
 */

import java.util.Scanner;

public class SayidanYaziyaDonusturme {

    public static void main(String[] args) {
        String[] dizi1 = {"", "", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
        String[] dizi2 = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};

        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir sayı giriniz");
        int sayi = klavye.nextInt();

        String birler = dizi1[sayi % 10];
        if(sayi%10==1){
        birler="bir";
        }
        sayi /= 10;
        String onlar = dizi2[sayi % 10];
        sayi /= 10;
        String yuzler = dizi1[sayi % 10];
        sayi /= 10;
        String binler = dizi1[sayi % 10];


        if(yuzler!="") {
            System.out.println(binler + " bin " + yuzler + " yüz " + onlar+" " +  birler);
        } else {
            System.out.println(binler + " bin " + onlar+" " +  birler);

        }



    }
}
