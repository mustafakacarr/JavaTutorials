/*
Soru: Sistem tarafından random oluşturulan sayıyı kullanıcının tahmin etmesini ve tahmin ile sayının büyüklük/küçüklük karşılaştırmasını yaparak kullanıcıya çıktı verecek
programın kodunu yazınız. Ek olarak kullanıcının doğru sayıya kaç adımda ulaştığını belirtiniz.
 */
import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {
        int tahmin = 0, sayac=0;
        Scanner klavye = new Scanner(System.in);
        int sayi = (int) (Math.random() * 100);
        System.out.println("Sayı tutuldu, lütfen tahmininizi giriniz.");
        tahmin = klavye.nextInt();

        while (tahmin != sayi) {
            sayac++;
            if (tahmin > sayi) {
                System.out.println("Bilemediniz, daha küçük bir sayı deneyiniz.");
            } else if (tahmin < sayi) {
                System.out.println("Bilemediniz, daha büyük bir sayı deneyiniz.");
            }
            tahmin = klavye.nextInt();

        }
        if (tahmin==sayi){
            System.out.println("Tebrikler! Tutulan sayıyı "+ sayac +" denemede buldunuz.");
        }


    }
}
