import java.util.Scanner;
public class JavaPow4n5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,toplam5=5,toplam4 =4;
        System.out.print("Lütfen Sınır Sayıyı Belirleyiniz: ");
        n = inp.nextInt();
        inp.close();
        if(n>=0){
        System.out.printf("4^0 = 1\n5^0 = 1\n");
        if(n!=0)
        System.out.printf("4^1 = 4\n5^1 = 5\n");
            for(int i=1;i<n;i++){
                toplam5 = 5*toplam5;
                toplam4 = 4*toplam4;
                if(toplam5<n){
                    System.out.printf("5^%d = %d\n",(i+1),toplam5);
                }
                if(toplam4<n){
                    System.out.printf("4^%d = %d\n",(i+1),toplam4);
                }
                if(toplam5 > n && toplam4 >n) break;            
            }
        }else System.out.println("Hatalı Giriş !");
    }
}
