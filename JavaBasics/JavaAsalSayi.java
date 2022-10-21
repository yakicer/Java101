package JavaBasics;
import java.util.Scanner;
public class JavaAsalSayi {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       int n=0,k=1;
       boolean flag = true;
       System.out.println("Lütfen Asal Sayıların Bulunacağı Sınırı Belirleyiniz: ");
        n = inp.nextInt();
        inp.close();

        for(int i = 1;i<=n;i++){ 
            flag = true;
            for(k = 2;k<i;k++){
                if(i%k==0){
                    flag = false;
                    break;}
            }
            if(flag == true)
            System.out.printf("%d ",i);
        }
    }
}
