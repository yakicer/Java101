import java.util.Scanner;
public class JavaLogin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String username,password,passwordcheck;

        System.out.println("Hoşgeldiniz.\n\nPrograma Devam etmek için Lütfen Kayıt Olunuz.");
        System.out.print("Lütfen Kullanıcı Adınızı Belirleyiniz: ");
        username = inp.next();
        System.out.print("Lütfen Şifrenizi Belirleyiniz(Minimum 6 Maksimum 20 karakter): ");
        password = inp.next();
        while((password.length() <= 5) || (password.length() >= 21))
        {
            System.out.println("Şifreniz 6 karakterden küçük, 20 karakterden büyük olamaz !\nLütfen tekrar deneyiniz. (0'ı tuşlayarak işlemi iptal edebilirsiniz.)");
            password = inp.next();
            if(password.equals("0")){System.exit(0);}
        }
        System.out.printf("Lütfen Belirlediğiniz Şifreyi Tekrar Giriniz: ");
        passwordcheck = inp.next();
        while(!password.equals(passwordcheck))
        {
            System.out.println("Şifreler Birbiri ile Eşleşmiyor ! ");
            System.out.print("Lütfen Belirlediğiniz Şifreyi Tekrar Giriniz(İşlem iptali için 0' ı tuşlayabilirsiniz) :");
            passwordcheck = inp.next();
            if(passwordcheck.equals("0"))
            {
               System.exit(0);
            }
        }
        inp.close();
        System.out.printf("Kullanıcı adınız: %s\nŞifreniz: %s",username,password);
    }
}
