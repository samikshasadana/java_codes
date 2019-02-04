import java.util.*;
class StrCmp{
public static void main(String arg[]){
    String s1="JAVA";
    String s2="Java";
    String s3= new String("JAVA");
    System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
System.out.println(s1==s2);
    System.out.println(s1==s3);

    

}
}