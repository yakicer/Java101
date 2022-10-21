package JavaBasics;
import java.util.Scanner;

public class JavaATM {
    public static void main(String[] args) {
        String userName, password,dusername="patika",dpassword="dev123",selection="";
        Scanner inp = new Scanner(System.in,"857");
        int right = 3;
        int balance = 1500;
        int select;
        System.out.println("İlk Kullanıma Özel Kullanıcı Adınız: 'patika' , Şifreniz: 'dev123'");
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = inp.nextLine();
            System.out.print("Parolanız : ");
            password = inp.nextLine();

            if (userName.equals(dusername) && password.equals(dpassword)) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:{
                            System.out.print("Yatırılacak Tutar : ");
                            int price = inp.nextInt();
                            balance += price;
                            System.out.printf("Para Yatırma işleminiz Tamamlanmıştır. Güncel Bakiyeniz = %d ",balance);
                        }break;
                        case 2:{
                            System.out.print("Çekilecek Tutar : ");
                            int price = inp.nextInt();
                            if (price > balance) {
                                do {
                                    System.out.printf("Bakiye yetersiz.(Güncel Bakiye = &d)\n Lütfen Geçerli Bir Tutar Giriniz.\nÇekilecek Tutar: ",balance);
                                    price = inp.nextInt();
                                } while (price>balance);
                            }else {
                                balance -= price;
                            }
                        }
                        case 3:
                        {
                            System.out.printf("Bakiyeniz : %d TL\n", balance);
                        }break;
                        case 4:
                        {
                            System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz! Tekrar görüşmek üzere!");
                            System.exit(0); 
                        }break;
                        default:
                        {
                            System.out.println("Anlık Sistem Arızası ! Lütfen Daha Sonra Tekrar Deneyiniz.");
                            System.exit(0); 
                        }
                            break;
                    }
                    System.out.printf("Başka Bir İşlem Yapmak İstiyor Musunuz ?\n(Evet , Hayır): ");
                    selection = inp.next();
                    if(selection.toLowerCase().equals("evet"))
                    {}
                    else if (selection.toLowerCase().equals("hayır")){
                        System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz! Tekrar Görüşmek Üzere !");
                        System.exit(0);    
                    }
                    else
                    {
                        System.out.println("Hatalı Giriş Yaptınız ! İşlem Sonlandırılıyor.");
                        System.exit(0);
                        
                    }
                } while (true);
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }inp.close();
    }
}