import java.util.*;
class username{
public static void main(String arg[]){
Scanner o=new Scanner(System.in);
String s=o.next();
int a=s.length() -1;
//System.out.println(a);
if(s.charAt(0)>=65 && s.charAt(0)<=90 && s.charAt(a)>=65 && s.charAt(a)<=90){
System.out.println("valid");}
else
System.out.println("invalid");
}}