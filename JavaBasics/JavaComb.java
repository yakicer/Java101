package JavaBasics;
import java.util.Scanner;
public class JavaComb {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N=1,R=1,NR=1;
        double ANR=0;
        System.out.print("Lütfen Kümenin Eleman Sayısını Giriniz: ");
        int n = inp.nextInt();
        System.out.print("Lütfen Oluşturulacak Grupların Eleman Sayısını Giriniz: ");
        int r = inp.nextInt();
        inp.close();
        for(int i=n;i>0;i--)
        {
            N*=i;
        }
        for(int i=r;i>0;i--)
        {
            R*=i;
        }
        for(int i=(n-r);i>0;i--)
        {
            NR*=i;
        }    
        ANR = N/(R*NR);
        System.out.printf("C(n,r) = %.2f",ANR);
    }
}
