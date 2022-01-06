/*
Kullanıcı tarafından tam sayı değerleri girilen 10 elemanlı dizinin toplamını ve ortalamasını hesaplayıp konsolda gösteren
programın kodunu yazınız.
 */
import java.util.Scanner;
public class DiziIslemleri2 {

    public static void main(String[] args) {
        int sum=0;
        Scanner keyboard = new Scanner(System.in);
        int[] array=new int[10];
        for(int i=1; i<=10; i++){
            System.out.println(i+". Sayıyı Giriniz.");
            int number=keyboard.nextInt();
            array[i-1]=number;
            sum+=number;
        }
        System.out.println("Girilen 10 sayının toplamı : "+ sum +"\nGirilen 10 sayının ortalaması : "+ (sum/10));

    }
}
