package JavaBasics;
import java.util.*;
public class JavaBurc {
    public static void main(String[] args) {
        //Değişkenlerin oluşturulması.
        Scanner inp = new Scanner(System.in, "857");
        String day,month,sign="Ejderya";
        boolean a = false, b = false, c, d = true,flag =true;
        //Arraylist ile ayları bir liste içerisinde depoladım ve ileride 
        //koşul kontrolü için kullanılacak. Kullanımı aşağıdaki gibidir.
        ArrayList < String > months = new ArrayList < String > (Arrays.asList("eylül", "ekim", "kasım", "aralık", "ocak",
            "şubat", "mart", "nisan", "mayıs", "haziran", "temmuz", "ağustos"));
        //Sistemi bir do-while döngüsü içine alarak kullanıcının devam edip etmemesini kontrol ettim.
        do {
            System.out.println("Lütfen Doğum Tarihinizi Gün ve Ay Şeklinde (Arada Boşluk Bırakarak) Giriniz:");
            day = inp.next();
            month = inp.next();
            //Kullanıcının girdiği değerlerin doğru girildiğinin kontrolü
            //c = Girilen day değeri integer bir değer mi ?
            //b = Girilen day değeri 0 ile 31 arasında mı ?
            //a = Girilen month değeri months listesinin içindeki değerlerden biri mi ?
            c = (day.matches("\\d*")) ? true : false;
            a = months.contains(month);
            if (c) b = (Integer.parseInt(day) < 1 || Integer.parseInt(day) >= 31) ? false : true;
            //Hatalı giriş durumunda while döngüsü içinde kullanıcıdan doğru değerin
            //girilmesini isteyen ikinci bir do-while döngüsüne giriliyor.
            while ((!c || !a) || !b) {
                do {
                    System.out.println("Lütfen Geçerli Bir Tarih Giriniz");
                    day = inp.next();
                    month = inp.next();
                    c = (day.matches("\\d*")) ? true : false;
                    //Buradaki koşul kontrolleri hem do-while döngüsünü
                    //hem de ilk while döngüsünü kırmak için kullanılıyor.
                    if (c) {
                        b = (Integer.parseInt(day) < 1 || Integer.parseInt(day) >= 31) ? false : true;
                        if (b) {
                            a = months.contains(month);
                            if (a) {
                                d = false;
                            } else d = true;
                        } else d = true;
                    } else d = true;
                } while (d);
            }
            //Bütün koşullar sağlanırsa burç hesaplama işlemine geçiliyor.
            System.out.print("***********************\nBurcunuz: ");
            if (month.toLowerCase().equals("şubat")) {
                sign = (Integer.parseInt(day) > 19)?"Balık":"Kova";
            } else if (month.toLowerCase().equals("mart")) {
                sign = (Integer.parseInt(day) > 20)?"Koç":"Balık";
            } else if (month.toLowerCase().equals("nisan")) {
                sign = (Integer.parseInt(day) > 20)?"Boğa":"Koç";
            } else if (month.toLowerCase().equals("mayıs")) {
                sign = (Integer.parseInt(day) > 21)?"İkizler":"Boğa";
            } else if (month.toLowerCase().equals("haziran")) {
                sign = (Integer.parseInt(day) > 22)?"Yengeç":"İkizler";
            } else if (month.toLowerCase().equals("temmuz")) {
                sign = (Integer.parseInt(day) > 22)?"Aslan":"Yengeç";
            } else if (month.toLowerCase().equals("ağustos")) {
                sign = (Integer.parseInt(day) > 22)?"Başak":"Aslan";
            } else if (month.toLowerCase().equals("eylül")) {
                sign = (Integer.parseInt(day) > 22)?"Terazi":"Başak";
            } else if (month.toLowerCase().equals("ekim")) {
                sign = (Integer.parseInt(day) > 22)?"Akrep":"Terazi";
            } else if (month.toLowerCase().equals("kasım")) {
                sign = (Integer.parseInt(day) > 21)?"Yay":"Akrep";
            } else if (month.toLowerCase().equals("aralık")) {
                sign = (Integer.parseInt(day) > 21)?"Oğlak":"Yay";
            } else if (month.toLowerCase().equals("ocak")) {
                sign = (Integer.parseInt(day) > 21)?"Kova":"Oğlak";
            }
            System.out.printf("%s\n***********************\n",sign);
            //Kullanıcı devam etmek isterse diye kontrol sağlanıp 
            //istemiyorsa eğer while döngüsü kırılıyor.
            System.out.println("Devam Etmek İstiyor musunuz ?(Devam Etmek İçin Evet Yazınız):");
            String check = inp.next();
            if (check.toLowerCase().equals("evet")) flag = true;
            else flag = false;
        } while (flag);
        inp.close();
    }
}