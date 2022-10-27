package JavaMethods;
import java.util.Scanner;
public class JavaRecPrime {

    static String isPrime(int n,int k)
    {    
        String result = "";
        if (n==2) return "Asaldır !";
        if (n<1) return "Geçersiz Değer !";
        if(k==1) {result = "Asaldır!"; return result;}
        if(n%k==0) result = "Asal Değildir !";
        else return isPrime(n,k-1);
        return result;
    }

    public static void main(String[] args) {
    
        Scanner inp = new Scanner(System.in);    
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        int n = inp.nextInt();
        System.out.println(isPrime(n,n-1));
        inp.close();

    }
    

}
