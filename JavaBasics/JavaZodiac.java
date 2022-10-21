package JavaBasics;
import java.util.*;
public class JavaZodiac {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //Burçları bir ArrayList içerisinde tanımladım.
        //Böylece burçları gösterirken onlarca if bloğuna ihtiyaç duymayacaz.
        ArrayList < String > zodiacs = new ArrayList < String > (Arrays.asList("Maymun", "Horoz", "Köpek", "Domuz", "Fare",
            "Öküz", "Kaplan", "Tavşan", "Ejderya", "Yılan", "At", "Koyun"));
        //Değişken tanımlamaları ve girdi alma
        String year;
        int i = 0;
        boolean flag = false;
        System.out.print("Lütfen Doğduğunuz Yılı Giriniz:");
        year = inp.next();
        //Girdilerin doğru girilip girilmediğinin kontrolü. Do-While döngüsü
        //dpğru girdi girilene ya da işlem iptaline kadar sürekli döngü oluşturacak.
        if ((!year.matches("\\d*")) || !(Integer.parseInt(year) > 1850 && Integer.parseInt(year) < 2023)) {
            flag = true;
            do {
                System.out.print("Hatalı Giriş Yaptınız !\nLütfen Doğduğunuz Yılı Giriniz(İşlem iptali için 0'ı tuşlayabilirsiniz.): ");
                year = inp.next();
                if (year.matches("\\d*")) {
                    if ((Integer.parseInt(year) > 1800 && Integer.parseInt(year) < 2023)) flag = false;
                    else if (year.equals("0")) {
                        System.exit(0);
                    } else flag = true;
                } else flag = true;
            } while (flag);
        }
        inp.close();
        //Output.
        i = Integer.parseInt(year) % 12;
        System.out.printf("Çin Zodyağı Burcunuz = %s", zodiacs.get(i));
    }
}
