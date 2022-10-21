package JavaBasics;
import java.util.Scanner;
public class JavaManav {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int kilo;
        double tutar = 0;
        System.out.print("Kaç Kilo Armut Aldınız? :  ");
        kilo = inp.nextInt();
        tutar += kilo*2.14;
        System.out.print("Kaç Kilo Elma Aldınız? :  ");
        kilo = inp.nextInt();
        tutar += kilo*3.67;
        System.out.print("Kaç Kilo Domates Aldınız? :  ");
        kilo = inp.nextInt();
        tutar += kilo*1.11;
        System.out.print("Kaç Kilo Muz Aldınız? :  ");
        kilo = inp.nextInt();
        tutar += kilo*0.95;
        System.out.print("Kaç Kilo Patlıcan Aldınız? :  ");
        kilo = inp.nextInt();
        tutar += kilo*5;
        inp.close();
        System.out.println("\nToplam Tutar = "+tutar+"\n\nLütfen Ödeme İçin Kasaya Gidiniz.\nESYAMAR İyi Alışverişler Diler.");
    }
}
