import java.util.*;
import java.io.*;

public class Mapping{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> dict = new HashMap<String,Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt(); 
            dict.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(!dict.containsKey(s))System.out.println("Not Found");
            else System.out.println(s+"="+dict.get(s));
        }
        in.close();
    }
}