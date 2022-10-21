package JavaBasics;
import java.util.Scanner;

/**
 * JavaOOP
 */
public class JavaNotOrt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int not;
        System.out.println("Matematik Notunu Giriniz:");
        not = input.nextInt();
        System.out.println("Fizik Notunu Giriniz:");
        not += input.nextInt();
        System.out.println("Kimya Notunu Giriniz:");
        not += input.nextInt();
        System.out.println("Türkçe Notunu Giriniz:");
        not += input.nextInt();
        System.out.println("Tarih Notunu Giriniz:");
        not += input.nextInt();
        System.out.println("Müzik Notunu Giriniz:");
        not += input.nextInt();
        input.close();
        not /=6;
        String kontrol = (not>=60)?"Geçti":"Kaldı";

        System.out.println(kontrol);
    }

}