package JavaBasics;
import java.util.Scanner;
public class JavaUcgen {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int A,B,C;
        double u,alan;
        System.out.println("Dik Üçgenin Kenarlarını Giriniz.");
        System.out.println("A kenarını giriniz:");
        A = input.nextInt();
        System.out.println("B kenarını giriniz:");
        B = input.nextInt();
        System.out.println("C kenarını giriniz:");
        C = input.nextInt();
        input.close();
        u = (A+B+C)/2;
        alan = Math.sqrt(u*(u-A)*(u-B)*(u-C));
        System.out.println("Üçgenin Alanı = " +alan);
    }
}
