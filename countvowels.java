import java.util.*;
class countvowels{
public static void main(String arg[]){
Scanner o= new Scanner(System.in);
String s1= o.next();
int count=0;
int n=s1.length();
for(int i=0;i<n;i++){
if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u'){
count=count+1;
}
}
System.out.println(count);}}