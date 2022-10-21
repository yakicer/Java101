package JavaBasics;
import java.util.Scanner;
public class JavaTersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n=0;
        System.out.println("Lütfen Basamak Sayısını Giriniz: ");
        n = inp.nextInt();
        System.out.printf("%d Basamaklı Ters Üçgen\n\n",n);
        inp.close();
        for (int i = n-1; i >= 0 ; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
