import java.util.Scanner;
public class JavaHarmonic {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double N=0;
        System.out.print("Lütfen Üssü Alınacak Sayıyı Giriniz: ");
        int n = inp.nextInt();
        int k = n;
        inp.close();
        for(double i=1;i<=n;i++)
        {
            N+=(1/i);
        }
        System.out.printf("%d sayısının Harmonik Serisi Sonucu = %.3f",k,N);
    }
}
