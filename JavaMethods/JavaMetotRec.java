package JavaMethods;
import java.util.Scanner;

public class JavaMetotRec {

    static int metot(int n,boolean k){
           
        if ( k == true) {
        System.out.print(n+" ");
        if (n == 25) return 0;
        
        return metot (n+5,k);
        
    }   if (n==0) {k = true;
        return metot(n,k);
    }
    System.out.print(n+" "); 
        return metot (n-5,k);
        
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        boolean k = false;
        metot(n,k);
    }
}
