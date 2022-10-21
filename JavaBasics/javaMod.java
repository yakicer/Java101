import java.util.Scanner;
public class javaMod {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,flag=0;
        double toplam =0;
        System.out.print("Lütfen Döngü Sonu Sayısını Belirleyiniz: ");
        n = inp.nextInt();
        inp.close();
        for(int i=1;i<n;i++)
        {
            if(i%3 == 0 && i%4 ==0)
            {
                toplam+=i;
                flag++;
            }
        }
        toplam /=flag;
        System.out.printf("Sonuç = %.2f",toplam);
    }
}
