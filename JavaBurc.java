import java.util.*;
public class JavaBurc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in,"857");
        int day;
        String month;
        boolean a = false,b,c;
        ArrayList<String> months = new ArrayList<String>(Arrays.asList("eylül","ekim","kasım","aralık","ocak","şubat","mart","nisan","mayıs","haziran","temmuz","ağustos"));
        try {
            System.out.println("Lütfen Doğum Tarihinizi Gün ve Ay Şeklinde (Arada Boşluk Bırakarak) Giriniz:");
            day = inp.nextInt();
            month = inp.next();
            b = (day<1 || day>=31) ?false:true;
            c = (day == (int)day)?true:false;
            if(!c)
            {
                if(!b)
                {
                do {
                    System.out.println("Lütfen Geçerli Bir Tarih Giriniz");
                    day = inp.nextInt();
                    month = inp.next();
                    b = (day<=1 || day>=31)?false:true;
                    a = months.contains(month);
                } while (!a || !b);
                }
                inp.close();
                if(month.toLowerCase().equals("şubat"))
                {
                    if(day>19)System.out.println("Balık Burcu");
                    else System.out.println("Kova Burcu");
                }
                else if(month.toLowerCase().equals("mart"))
                {
                    if(day>20)System.out.println("Balık Burcu");
                    else System.out.println("Kova Burcu");
                }
                else if(month.toLowerCase().equals("nisan"))
                {
                    if(day>20)System.out.println("Boğa Burcu");
                    else System.out.println("Koç Burcu");
                }  
                else if(month.toLowerCase().equals("mayıs"))
                {
                    if(day>21)System.out.println("İkizler Burcu");
                    else System.out.println("Boğa Burcu");
                }  
                else if(month.toLowerCase().equals("haziran"))
                {
                    if(day>22)System.out.println("Yengeç Burcu");
                    else System.out.println("İkizler Burcu");
                }  
                else if(month.toLowerCase().equals("temmuz"))
                {
                    if(day>22)System.out.println("Aslan Burcu");
                    else System.out.println("Yengeç Burcu");
                }  
                else if(month.toLowerCase().equals("ağustos"))
                {
                    if(day>22)System.out.println("Başak Burcu");
                    else System.out.println("Aslan Burcu");
                }  
                else if(month.toLowerCase().equals("eylül"))
                {
                    if(day>22)System.out.println("Terazi Burcu");
                    else System.out.println("Başak Burcu");
                }
                else if(month.toLowerCase().equals("ekim"))
                {
                    if(day>22)System.out.println("Akrep Burcu");
                    else System.out.println("Terazi Burcu");
                }
                else if(month.toLowerCase().equals("kasım"))
                {
                    if(day>21)System.out.println("Yay Burcu");
                    else System.out.println("Akrep Burcu");
                }
                else if(month.toLowerCase().equals("aralık"))
                {
                    if(day>21)System.out.println("Oğlak Burcu");
                    else System.out.println("Yay Burcu");
                }
                else if(month.toLowerCase().equals("ocak"))
                {
                    if(day>21)System.out.println("Kova Burcu");
                     else System.out.println("Oğlak Burcu");
                }
            }
                             
        } catch (Exception e) {
            System.out.println("SİSTEM HATASI ! LÜTFEN PROGRAMI BAŞTAN BAŞLATINIZ ! \nLütfen Gün ve Ay Arasına Boşluk Bırakınız.");
        }
    }
}