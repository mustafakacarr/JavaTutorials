/*
Soru: Kullanıcı tarafından girilen TC kimlik numarasının geçerliliğini kontrol eden programın kodunu yazınız.

Çözüm Ayrıntları;

-TC kimlik numaraları 0 ile başlayamaz.
-TC kimlik numaralarının 1. 3. 5. 7. ve 9. hanelerinin toplamının 7 katından, 2. 4. 6. ve 8. hanelerinin toplamı
çıkartıldığında, elde edilen sonucun 10'a bölümünden kalan, yani mod10'u 10. haneyi verir.
-1. 2. 3. 4. 5. 6. 7. 8. 9. ve 10. hanelerin toplamından elde edilen sonucun 10'a bölümünden kalan, yani mod10'u 11. haneyi
verir.

 */

import java.util.Scanner;
public class TCKimlikGecerlilikKontrolu {

    public static void main(String[] args) {
	Scanner klavye=new Scanner(System.in);
    System.out.println("Lütfen TC kimlik numarası giriniz.");
    String tc=klavye.nextLine();
    if(tc.startsWith("0")){
        System.out.println("TC kimlik numarasının ilk hanesi 0 olamaz.");
    }else{
    System.out.println(GecerlilikKontrol(tc));
    }
    }

    public static String GecerlilikKontrol(String tcKimlik){
        int tekHaneler=Character.getNumericValue(tcKimlik.charAt(0))+Character.getNumericValue(tcKimlik.charAt(2))+
                Character.getNumericValue(tcKimlik.charAt(4))+Character.getNumericValue(tcKimlik.charAt(6))+
                Character.getNumericValue(tcKimlik.charAt(8));
        int ciftHaneler=Character.getNumericValue(tcKimlik.charAt(1))+Character.getNumericValue(tcKimlik.charAt(3))+
                Character.getNumericValue(tcKimlik.charAt(5))+Character.getNumericValue(tcKimlik.charAt(7));
        int onuncuHance=(tekHaneler*7-ciftHaneler)%10;
        int kontrol=(tekHaneler+ciftHaneler+onuncuHance)%10;
        String sonIkiHane= Integer.toString(onuncuHance)+Integer.toString(kontrol);
        if(sonIkiHane!=tcKimlik.substring(9)){
            return sonIkiHane + "\n"+tcKimlik.substring(9);
        }else{
            return "TC kimlik numarası geçerlidir.";
        }
    }

}
