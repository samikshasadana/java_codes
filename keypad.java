import java.util.*;
public class keypad{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        int[] a=new int[8];
        a[0]=294;
        a[1]=303;
        a[2]=312;
        a[3]=321;
        a[4]=330;
        a[5]=454;
        a[6]=351;
        a[7]=482;
    int n =s.length();
    int sum=0,flag=0;
    for(int i=0;i<n;i++){
    
        sum=sum+(int)s.charAt(i);
        }
        System.out.println(sum);
        for(int i=0;i<8;i++){
        if(a[i]==sum){
        System.out.println(i+2);
        flag=1;}}
        if(flag==0){
            System.out.println("string not matched");

        }
        }}

