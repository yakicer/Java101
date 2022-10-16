import java.util.Scanner;
public class JavaArmstrong {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int flag = 0,N=0;
        System.out.print("Lütfen Üssü Alınacak Sayıyı Giriniz: ");
        int n = inp.nextInt();
        int k = n;
        inp.close();
        while(n>10)
        {
            N += n%10;
            n=n/10;
            flag++;
        }
        flag++;
        N+=n;
        System.out.printf("%d sayısı %d basamaklıdır ve basamaklarının toplamı = %d",k,flag,N);
    }
}