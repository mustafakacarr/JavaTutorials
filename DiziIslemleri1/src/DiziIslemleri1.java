import java.util.Scanner;

public class DiziIslemleri1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Lütfen eleman sayısı giriniz :");
        int elemanSayisi = keyboard.nextInt();
        int arrayOneCounter = 0;
        int arrayTwoCounter = 0;
        int[] arrayOne = new int[elemanSayisi];
        int[] arrayTwo = new int[elemanSayisi];

        for (int i = 0; i < elemanSayisi; i++) {
            int randomNumber = (int) (Math.random() * 100);
            if (randomNumber < 50 && randomNumber % 2 == 0) {
                arrayOne[arrayOneCounter] = randomNumber;
                arrayOneCounter++;
                System.out.println(randomNumber + " sayısı 1.diziye eklendi.");

            } else if (randomNumber > 50 && randomNumber % 2 != 0) {
                arrayTwo[arrayTwoCounter] = randomNumber;
                arrayTwoCounter++;
                System.out.println(randomNumber + " sayısı 2.diziye eklendi.");
            }
        }
        System.out.print("\n1. Diziye ait elemanlar = ");
        for (int j = 0; j < arrayOneCounter; j++) {
            System.out.print(arrayOne[j] + " , ");
        }

        System.out.print("\n2. Diziye ait elemanlar = ");
        for (int j = 0; j < arrayTwoCounter; j++) {
            System.out.print(arrayTwo[j] + " , ");
        }

    System.out.println("\n2 dizinin eleman sayıları toplamı = "+(arrayOneCounter+arrayTwoCounter));
    }
}
