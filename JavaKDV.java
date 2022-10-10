import java.util.Scanner;

public class JavaKDV {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar;
        boolean deger = false;

while ( deger == false){
    
    System.out.println("Lütfen Tutar Giriniz:");
    tutar = input.nextInt();
    
    if(tutar < 0)
    {
        System.out.println("Tutar 0'dan Küçük olamaz.");
        deger = false;
    }
    else if (tutar < 1000)
    {
        tutar = (tutar*18)/100;
        deger = true;
        System.out.println("KDV = " + tutar);   
    }
    else
    {
        tutar = (tutar*8)/100;
        deger = true;
        System.out.println("KDV = " + tutar);   
    }
}
   input.close(); 
    }
}