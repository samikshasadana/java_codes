import java.util.*;
class sort{
public static void main(String arg[]){
int i,j;
int[]a=new int[5];
Scanner o=new Scanner(System.in);
for(i=0;i<5;i++)
a[i]=o.nextInt();
for(i=0;i<5;i++){
for(j=0;j<5-i-1;j++){
if(a[j]>a[j+1]){
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
    for(i=0;i<5;i++){
    System.out.print(a[i]+"    ");}
}
}