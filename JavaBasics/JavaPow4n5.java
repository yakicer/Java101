package JavaBasics;
import java.util.Scanner;
public class JavaPow4n5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,toplam5=5,toplam4 =4;
        System.out.print("Lütfen Sınır Sayıyı Belirleyiniz: ");
        n = inp.nextInt();
        inp.close();
        if(n>=0){
        System.out.printf("5^0 = 1\n4^0 = 1\n");
            for(int i=1;i<n;i++){
                if(toplam5<=n){
                    System.out.printf("5^%d = %d\n",(i),toplam5);
                }
                if(toplam4<=n){
                    System.out.printf("4^%d = %d\n",(i),toplam4);
                }
                if(toplam5 > n && toplam4 >n) break;
                toplam5 = 5*toplam5;
                toplam4 = 4*toplam4;            
            }
        }else System.out.println("Hatalı Giriş !");
    }
}
