import java.util.Scanner;
public class JavaDaire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yaricap,merkezaci;
        double alan;

        System.out.println("Lütfen Dairenin Yarıçapını Giriniz: ");
        yaricap = input.nextInt();
        System.out.println("Lütfen Dairenin Merkez Açısını Giriniz: ");
        merkezaci = input.nextInt();
        input.close();

        alan = ((Math.PI*(yaricap*yaricap)*merkezaci)/360);

        System.out.println("Dairenin Alanı = "+alan);
    }
}
