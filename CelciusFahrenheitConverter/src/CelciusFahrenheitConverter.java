import java.util.Scanner;
public class CelciusFahrenheitConverter {
    public static void main(String[] args){
        double deg,fah;
        Scanner klavye=new Scanner(System.in);

        System.out.println("Derece cinsinden sıcaklık değerini giriniz :");
        deg = klavye.nextInt();
        fah = deg * 1.8 + 32;
        System.out.println("Fahrenhayt:"+fah);
    }
}
