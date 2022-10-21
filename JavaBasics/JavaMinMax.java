import java.util.Scanner;
public class JavaMinMax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,min=2147483647,max=0,temp=0;
        System.out.println("Kaç Adet Sayı Gireceksiniz ?");
        n = inp.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.printf("%d. Sayıyı Giriniz: ",i);
            temp = inp.nextInt();
            if (temp>=max)max = temp;
            if (temp<=min)min = temp;
        }
        inp.close();
        System.out.printf("En Büyük Sayı = %d\nEn Küçük Sayı = %d",max,min); 
    }
}
