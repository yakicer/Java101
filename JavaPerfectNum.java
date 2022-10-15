import java.util.Scanner;
public class JavaPerfectNum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num=0,temp=0,i=1;
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        num = inp.nextInt();
        while(i<num)
        {
            if(num%i==0)
            {
                temp += i;
            }
            i++;
        }
        inp.close();
        if(temp == num)System.out.printf("%d Mükemmel Sayıdır.",num);
        else System.out.printf("%d Mükemmel Sayı Değildir.",num);
    }
}