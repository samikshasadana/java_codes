import java.util.*;
class my_switch{
public static void main(String arg[]){
int c,a=10,b=20;
Scanner obj=new Scanner(System.in);
c= obj.nextInt();
switch(c)
{
case 1:
System.out.println("addition");
int add=a+b;
System.out.println(add);
break;
case 2:
System.out.println("subtraction");
int sub=b-a;
System.out.println(sub);
break;
default:
System.out.println("wrong choice");}}}
