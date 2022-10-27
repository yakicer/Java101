package JavaMethods;
import java.util.Scanner;

public class JavaRecursive {
    static long f(int n){

        if(n==1 || n==2)return 1;
       
        return f(n-1)+f(n-2);
    }
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen Hesaplanmasını İstediğiniz Dizi Sınırını Giriniz. (MAX DEĞER = '45' ");
        n = inp.nextInt();
        inp.close();
        if (n>45){
            System.out.println("Max İşlemci Veri Hesaplaması Sınırı! İşlem iptal edildi.");
            System.exit(0);
            }
        for( int i = n; i>0; i--)
        {
            System.out.print(f(i)+" ");
        }
        System.out.print(0);
    }
}


