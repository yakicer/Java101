package JavaBasics;
import java.util.Scanner;
public class JavaSort {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1,n2,n3;
        System.out.print("Lütfen ilk Sayıyı giriniz.");
        n1 = inp.nextInt();
        System.out.print("Lütfen İkinci Sayıyı giriniz.");
        n2 = inp.nextInt();
        System.out.print("Lütfen Üçüncü Sayıyı giriniz.");
        n3 = inp.nextInt();
        inp.close();
        if((n1>n2)&&(n1>n3))
        {
            if(n2>n3)
            {
                System.out.printf("Büyükten Küçüğe Sıralama = %d - %d - %d",n1,n2,n3);
            }
            else
            {
                System.out.printf("Büyükten Küçüğe Sıralama = %d - %d - %d",n1,n3,n2);
            }
        }
        else if ((n1>n2)&&(n1<n3))
        {
            System.out.printf("Büyükten Küçüğe Sıralama = %d - %d - %d",n3,n1,n2);
        }
        else if ((n1<n2)&&(n1<n3))
        {
            if(n2>n3)
            {
                System.out.printf("Büyükten Küçüğe Sıralama = %d - %d - %d",n2,n3,n1);
            }
            else
            {
                System.out.printf("Büyükten Küçüğe Sıralama = %d - %d - %d",n3,n2,n1);
            }
        }
        else 
        {
            System.out.printf("Büyükten Küçüğe Sıralama = %d - %d - %d",n2,n1,n3);
        }
    }
}
