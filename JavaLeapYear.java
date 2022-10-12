import java.util.Scanner;
public class JavaLeapYear {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String year;
        boolean flag = false;
        System.out.print("Lütfen Kontrol Etmek İstediğiniz Yılı Giriniz:");
        year = inp.next();
        //Girdilerin doğru girilip girilmediğinin kontrolü. Do-While döngüsü
        //dpğru girdi girilene ya da işlem iptaline kadar sürekli döngü oluşturacak.
        if ((!year.matches("\\d*")) || !(Integer.parseInt(year) > 0)) {
            flag = true;
            do {
                System.out.print("Hatalı Giriş Yaptınız !\nLütfen Kontrol etmek istediğiniz Yılı Giriniz(İşlem iptali için 0'ı tuşlayabilirsiniz.): ");
                year = inp.next();
                if (year.matches("\\d*")) {
                    if (Integer.parseInt(year) > 0) flag = false;
                    else if (year.equals("0")) {
                        System.exit(0);
                    } else flag = true;
                } else flag = true;
            } while (flag);
        }
        inp.close();
        //Output.
        if (Integer.parseInt(year) % 100 == 0)
        {
            if(Integer.parseInt(year)%400 == 0) System.out.printf("%s Artık Yıldır.",year);
            else System.out.printf("%s Artık Yıl değildir.",year);
        }
        else if (Integer.parseInt(year) % 4 == 0) System.out.printf("%s Artık Yıldır.",year);
        else System.out.printf("%s Artık Yıl değildir.",year);   
    }
}
