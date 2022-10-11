import java.util.Scanner;
public class JavaSuggestion {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int degree,a=0;
        String[] sugg = {"Kayak", "Sinema", "Piknik", "Yüzme"};
        System.out.println("Hava Kaç Derece ?");
        degree = inp.nextInt();
        inp.close();
        while(degree>=(-30))
        {
            a = (((degree <5))?1:0);
            if(a == 1)break;
            a = (((degree <15)&& (degree >=5) )?2:0);
            if(a == 2)break;
            a = (((degree <25)&& (degree >=15) )?3:0);
            if(a == 3)break;
            a = (((degree <70)&& (degree >=25) )?4:0);
            if(a == 4)break;
        }
       switch(a){
        case 0:{System.out.printf("Hava ya çok soğuk ya da çok sıcak. En iyisi evde kalmak !");break;}
        case 1:{System.out.printf("Önerilen Aktivite --> %s. İyi Eğlenceler !",sugg[0]);break;}
        case 2:{System.out.printf("Önerilen Aktivite --> %s. İyi Eğlenceler !",sugg[1]);break;}
        case 3:{System.out.printf("Önerilen Aktivite --> %s. İyi Eğlenceler !",sugg[2]);break;}
        case 4:{System.out.printf("Önerilen Aktivite --> %s. İyi Eğlenceler !",sugg[3]);break;}
        default: {System.out.println("Beklenmeyen bir durum var! Kıyamet mi kopuyor ?");break;}
       }
    }
}
