import java.util.*;
public class toggle{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        int n=s.length();
        for(int i=0;i<n;i++){
            if((int)s.charAt(i)<112 && (int)s.charAt(i)>97){
                int a=(int)s.charAt(i)-32;
                char b=(char)a;
                System.out.print(b);
            }
            else{
                int a=(int)s.charAt(i)+32;
                char b=(char)a;
                System.out.print(b);
                }
        }}}