package JavaMethods;
import java.util.Scanner;

public class JavaPolindrom {
    public static void main(String args[]) {
        long x;
        String s;
        Scanner inp = new Scanner(System.in);
        x = inp.nextLong();
        inp.close();
        s = run(x);
        System.out.printf("%d sayısı %s",x,s);
    }
    static String run(long x) {

        long length = (int) (Math.log10(x) + 1);
        long lengthx = length;
        long a,b;

        for(int i = 1 ; i<=lengthx/2; i++ )
        {
            a = x/(long)(Math.pow(10, length-1));
            b = x%10;
            if(a!=b){
                return "Palindrom Sayı Değildir!";
            }
            x=x-(long)((Math.pow(10, length-1))*a);
            x=x/10;
            length = (long) (Math.log10(x) + 1);     
        }
        return "Palindrom Sayıdır";
    }
}