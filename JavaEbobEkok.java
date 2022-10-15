import java.util.Scanner;
public class JavaEbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n=0,ebob=0,ekok=0,k=0,i=1;
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        n=inp.nextInt();
        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        k=inp.nextInt();
        while(i<=n || i<=k)
        {
            if(n%i==0 && k%i==0)
            {
                ebob = i;
            }
            i++;
        }
        inp.close();
        ekok = (n*k)/ebob;
        System.out.printf("Ebob = %d\nEkok = %d",ebob,ekok);
    }
}