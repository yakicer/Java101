package JavaMethods;
import java.util.Scanner;

public class JavaPowRec {

    static int pow(int i, int k){
        int result = i;
        if (k==0) return 1;
        if (k==1)
        return result;
        result *= pow(i,k-1);
        return result;

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayıyı Giriniz: ");
        int i = inp.nextInt();
        System.out.print("Üs Değerini Giriniz: ");
        int k = inp.nextInt();

        System.out.println("Sonuç = "+pow(i,k));
        
        
    }
}
