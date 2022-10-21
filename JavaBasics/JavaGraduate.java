package JavaBasics;
import java.util.Scanner;
public class JavaGraduate {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int not;
        double ort = 0;
        String[] dersler = {"Matematik","Fizik","Türkçe","Kimya","Müzik"}; 

       for(int i=0;i<dersler.length;i++)
       {
        System.out.printf("%s Notunu Giriniz:",dersler[i]);
        not = inp.nextInt();
        if((not<0)||(not>100)){
        }
        else{
            ort +=not;
        }
       }
       inp.close();
       ort = ort/(dersler.length);
       String a = (ort<55)?"Kaldı":"Geçti";
       System.out.printf("Öğrenci Dersten %s !",a);
    }
}
