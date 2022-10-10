import java.util.Scanner;
public class JavaCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int selection;
        double sonuc,n1,n2;
        System.out.println("İlk Sayıyı Giriniz: ");
        n1 = inp.nextInt();
        System.out.println("İkinci Sayıyı Giriniz: ");
        n2 = inp.nextInt();
        System.out.println("Toplama = 1, Çıkarma = 2, Çarpma = 3, Bölme = 4\nYapmak istediğiniz işlemi seçiniz: ");
        selection = inp.nextInt();
        inp.close();
        switch(selection)
        {
            case 1: {
                sonuc = n1 + n2;
                System.out.printf("%.0f",sonuc);
            }
            break;
            case 2: {
                sonuc = n1 - n2;
                System.out.printf("%.0f",sonuc);
            }
            break;
            case 3: {
                sonuc = n1 * n2;
                System.out.printf("%.0f",sonuc);
            }
            break;
            case 4: {
                if(n2==0){
                    System.out.println("Bölen 0'a eşit olamaz.");
                }
                sonuc = n1 / n2;
                System.out.printf("%.3f",sonuc);
            }
            break;
            default: {System.out.printf("Hatalı Tuşlama!");}
        }
    }
}
