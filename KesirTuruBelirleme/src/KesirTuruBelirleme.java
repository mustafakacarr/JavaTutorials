import java.util.Scanner;
public class KesirTuruBelirleme {

    public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
    System.out.println("Lütfen kesrin payını giriniz.");
    int pay=klavye.nextInt();
    System.out.println("Lütfen kesrin paydasını giriniz.");
    int payda=klavye.nextInt();


    if(pay>payda){
        System.out.println(pay + "/" + payda +" kesri bileşik kesirdir. ");
    }else if(pay==payda){
        System.out.println(pay + "/" + payda +" kesri tam kesirdir. ");
    } else{
        System.out.println(pay + "/" + payda +" kesri basit kesirdir. ");
    }


    }
}
