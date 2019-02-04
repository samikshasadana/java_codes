import java.util.*;
class array_sum{
public static void main(String arg[]){
Scanner o= new Scanner(System.in);
int i;
int[]a=new int[4];
int[]b=new int[4];
int[]c= new int[4];
for (i=0;i<4;i++)
a[i]= o.nextInt();
for (i=0;i<4;i++)
b[i]= o.nextInt();
for (i=0;i<4;i++)
c[i]=a[i]+b[i];

for (i=0;i<4;i++)
System.out.print(c[i]+"   ");
}}