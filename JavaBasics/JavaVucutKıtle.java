package JavaBasics;
import java.util.Scanner;
public class JavaVucutKıtle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double boy,vke;
        int kilo;
        System.out.print("Lütfen Boyunuzu (Metre Cinsinden) Giriniz: ");
        boy = inp.nextDouble();
        
        while((boy >= 4) || (boy <=0.3))
        {
            System.out.print("Lütfen Geçerli Bir Değer Giriniz (Metre Cinsinden !): ");
            boy = inp.nextDouble();
        }
        System.out.print("Lütfen Kilonuzu (Kilogram Cinsinden) Giriniz: ");
        kilo = inp.nextInt();
        while((kilo >= 750) || (kilo <=15))
        {
            System.out.print("Lütfen Geçerli Bir Değer Giriniz (Kilogram Cinsinden !): ");
            kilo = inp.nextInt();
        }
        inp.close();

        vke = kilo / (boy*boy);

        System.out.print("Vücut Kitle Endeksiniz: " + vke);
    }
}
