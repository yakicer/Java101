import java.util.Scanner;
public class JavaUs {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N=1;
        System.out.print("Lütfen Üssü Alınacak Sayıyı Giriniz: ");
        int n = inp.nextInt();
        N=n;
        System.out.print("Lütfen Üs Sayısını Giriniz: ");
        int r = inp.nextInt();
        inp.close();
        for(int i=1;i<=r;i++)
        {
            N= N*n;
        }
        System.out.printf("%d^%d = %d",n,r,N);
    }
}