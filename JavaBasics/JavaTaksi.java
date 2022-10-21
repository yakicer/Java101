import java.util.Scanner;

public class JavaTaksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km;
        double ucret;

        System.out.println("Lütfen Gidilen Kilometleryi Giriniz: ");
        km = input.nextInt();
        input.close();
        ucret = (10 + (km*2.20)); 
        if((ucret >=0) && (ucret <= 20) )
        {
            System.out.println("İndi Bindi ücreti 20 TL dir.");
        }
        else if(ucret > 20)
        {
            System.out.println("Yolculuk Ücretiniz " +ucret+" TL dir.");
        }
        else{
            System.out.println("Ortada Garip bir durum var. Taksiciyi gasp etmeye mi çalışıyorsunuz ?");
        }

    }
}
