import java.util.*;
public class JavaBurc {
    public static void main(String[] args) {
        //Değişkenlerin oluşturulması.
        boolean flag = true;
        Scanner inp = new Scanner(System.in, "857");
        String day;
        String month;
        boolean a = false, b = false, c, d = true;
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
                if (Integer.parseInt(day) > 19) System.out.println("Balık Burcu");
                else System.out.println("Kova Burcu");
            } else if (month.toLowerCase().equals("mart")) {
                if (Integer.parseInt(day) > 20) System.out.println("Balık Burcu");
                else System.out.println("Kova Burcu");
            } else if (month.toLowerCase().equals("nisan")) {
                if (Integer.parseInt(day) > 20) System.out.println("Boğa Burcu");
                else System.out.println("Koç Burcu");
            } else if (month.toLowerCase().equals("mayıs")) {
                if (Integer.parseInt(day) > 21) System.out.println("İkizler Burcu");
                else System.out.println("Boğa Burcu");
            } else if (month.toLowerCase().equals("haziran")) {
                if (Integer.parseInt(day) > 22) System.out.println("Yengeç Burcu");
                else System.out.println("İkizler Burcu");
            } else if (month.toLowerCase().equals("temmuz")) {
                if (Integer.parseInt(day) > 22) System.out.println("Aslan Burcu");
                else System.out.println("Yengeç Burcu");
            } else if (month.toLowerCase().equals("ağustos")) {
                if (Integer.parseInt(day) > 22) System.out.println("Başak Burcu");
                else System.out.println("Aslan Burcu");
            } else if (month.toLowerCase().equals("eylül")) {
                if (Integer.parseInt(day) > 22) System.out.println("Terazi Burcu");
                else System.out.println("Başak Burcu");
            } else if (month.toLowerCase().equals("ekim")) {
                if (Integer.parseInt(day) > 22) System.out.println("Akrep Burcu");
                else System.out.println("Terazi Burcu");
            } else if (month.toLowerCase().equals("kasım")) {
                if (Integer.parseInt(day) > 21) System.out.println("Yay Burcu");
                else System.out.println("Akrep Burcu");
            } else if (month.toLowerCase().equals("aralık")) {
                if (Integer.parseInt(day) > 21) System.out.println("Oğlak Burcu");
                else System.out.println("Yay Burcu");
            } else if (month.toLowerCase().equals("ocak")) {
                if (Integer.parseInt(day) > 21) System.out.println("Kova Burcu");
                else System.out.println("Oğlak Burcu");
            }
            System.out.println("***********************");
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