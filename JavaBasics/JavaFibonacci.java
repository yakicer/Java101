import java.util.Scanner;
public class JavaFibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n=0,result=0,k=1,j=0;
        n = inp.nextInt();
        System.out.printf("%d Basamaklı Fibonacci Dizisi:\n",n);
        inp.close();
        for(int i = 0;i<n;i++){
            result = j + k ;
            System.out.printf("%d + %d = %d\n",j,k,result);
            j = k;
            k = result;
        }
    }
}
