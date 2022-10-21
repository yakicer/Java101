package JavaBasics;
import java.util.Scanner;
public class JavaMod4Top {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n=0,toplam=0;
        do {
            System.out.print("Lütfen Sayı Giriniz: ");
            n = inp.nextInt();
            if(n%4==0)
            {
                toplam += n;
            }
        } while (n%2==0);
        inp.close();
        System.out.printf("Sonuç = %d",toplam);
    }
}