package JavaBasics;
import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {
        int i;
        double k;
        String s;

        Scanner scan = new Scanner(System.in);

        System.out.println("integer giriniz");
        i = scan.nextInt();
        System.out.println("\ndouble giriniz");
        k = scan.nextDouble();
        scan.nextLine();
        System.out.println("string giriniz");
        s = scan.nextLine();
        
        scan.close();
        System.out.println("l = " +i+"k = " +k+ "s ="+s);

    }
}
