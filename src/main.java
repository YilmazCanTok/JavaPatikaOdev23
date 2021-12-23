
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("*******************************************************");
        System.out.println("Arrayin Indexlerinin Harmonik Toplamını Bulan Program");
        System.out.println("-------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Arrayin uzunluğunu belirtiniz : ");
        int number = scanner.nextInt();
        if (number>0) {
            double[] array = new double[number];
            double toplam = 0;
            for (int i = 0; i < number; i++) {
                System.out.print("Lütfen "+(i+1)+". İndex değerini giriniz : ");
                array[i] = scanner.nextDouble();
                toplam = toplam + (1/array[i]);
            }
            System.out.println("-------------------------------------------------------");
            System.out.println("Toplam : "+toplam);
        }
        else{
            System.out.println(0);
        }
        System.out.println("*******************************************************");
        
    }
}