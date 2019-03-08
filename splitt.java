import java.util.*;
public class splitt{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String[] a=s.split("\\s");
        //int n=a.length;
       // System.out.println(n);
       for(String w:a){
            System.out.println(w);
        }
}}