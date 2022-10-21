import java.util.Scanner;
public class JavaUcus {
    public static void main(String[] args) {
        //Değişken tanımlamaları ve Scanner sınıfı çağırma işlemi.
        Scanner inp = new Scanner(System.in, "857");
        int a;
        double tutar;
        String fullname, yas, tip, km;
        boolean flag = true;
        System.out.print("ESYA AIRLINES'ı Tercih Ettiğiniz İçin Teşekkür Ederiz.\nLütfen Adınızı ve Soyadınızı Giriniz: ");
        fullname = inp.nextLine();
        System.out.print("Lütfen Yaşınızı Giriniz: ");
        yas = inp.next();
        //Kullanıcıdan alınan verilerin geçerlilik kontrolü ve doğru veri girilene
        //kadar döngüyü döndürme işlemi.(Döngüyü kırmak için veri kontrolü mevcut)
        if ((!yas.matches("\\d*")) || !(Integer.parseInt(yas) < 200 && Integer.parseInt(yas) > 0)) {
            do {
                flag = true;
                System.out.print("Hatalı Tuşlama !\nLütfen Yaşınızı Tekrar Giriniz(İşlem iptali için 'İptal' yazabilirsiniz): ");
                yas = inp.next();
                if ((yas.matches("\\d*"))) {
                    if (Integer.parseInt(yas) < 200 && Integer.parseInt(yas) > 0) {
                        flag = false;
                    } else flag = true;
                } else if (yas.toLowerCase().equals("iptal")) {
                    System.exit(0);
                } else flag = true;
            } while (flag);
        }
        System.out.print("Lütfen Gidilecek Tahmini Mesafeyi Giriniz: ");
        km = inp.next();
        if ((!km.matches("\\d*")) || !(Integer.parseInt(km) < 999999 && Integer.parseInt(km) > 0)) {
            do {
                flag = true;
                System.out.print("Hatalı Tuşlama !\nLütfen Kilometreyi Tekrar Giriniz(İşlem iptali için 'İptal' yazabilirsiniz): ");
                km = inp.next();
                if ((km.matches("\\d*"))) {
                    if (Integer.parseInt(km) < 99999 && Integer.parseInt(km) > 0) {
                        flag = false;
                    } else flag = true;
                } else if (km.toLowerCase().equals("iptal")) {
                    System.exit(0);
                } else flag = true;
            } while (flag);
        }
        System.out.print("Lütfen Yolculuk Tipini Seçiniz\n(1 = Tek Yön , 2 = Gidiş-Dönüş)\nSeçiminiz: ");
        tip = inp.next();
        if ((!tip.matches("\\d*")) || !(Integer.parseInt(tip) == 1 || Integer.parseInt(tip) == 2)) {
            do {
                flag = true;
                System.out.print("Hatalı Tuşlama !\nLütfen Seçiminizi Tekrar Giriniz\n(1 = Tek Yön , 2 = Gidiş-Dönüş , İşlem iptali için 'İptal' yazabilirsiniz)\nSeçiminiz: ");
                tip = inp.next();
                if ((tip.matches("\\d*"))) {
                    if (Integer.parseInt(tip) == 1 || Integer.parseInt(tip) == 2)
                        flag = false;
                } else if (tip.toLowerCase().equals("iptal")) {
                    System.exit(0);
                } else flag = true;
            } while (flag);
        }
        inp.close();
        //Kullanıcıdan alınan verilerin işlenmesi ve tutar hesaplaması.
        tutar = Integer.parseInt(km) * 0.1;
        if (Integer.parseInt(yas) < 12) a = 1;
        else if (Integer.parseInt(yas) > 65) a = 2;
        else a = 3;
        switch (a) {
        case 1: {
            if (Integer.parseInt(tip) == 1) tutar -= tutar * 0.5;
            else {
                tutar = tutar * 2;
                tutar -= tutar * 0.5;
                tutar -= tutar * 0.2;
            }
        }
        case 2: {
            if (Integer.parseInt(tip) == 1) tutar -= tutar * 0.3;
            else {
                tutar = tutar * 2;
                tutar -= tutar * 0.3;
                tutar -= tutar * 0.2;
            }
        }
        case 3: {
            if (Integer.parseInt(tip) == 1) tutar -= tutar * 0.1;
            else {
                tutar = tutar * 2;
                tutar -= tutar * 0.1;
                tutar -= tutar * 0.2;
            }
        }
        default:
            System.out.println("PİSTON AŞAĞI ! UÇUŞLAR İPTAL !!!");
        }
        //Output
        System.out.printf("Sayın %s (Yaş: %s) \nUçuş Bilgileriniz", fullname, yas);
        System.out.println("\n---------------------------------------------------------");
        System.out.printf("Mesafe = %s KM\nTutar = %.2f TL", km, tutar);
        System.out.println("\n---------------------------------------------------------");
        System.out.println("ESYA AIRLINES'ı Tercih Ettiğiniz İçin Teşekkür Ederiz.\nİyi Yolculuklar Dileriz.");
    }
}
