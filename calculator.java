import java.util.Scanner;
class calculator
{
public static void main(String arg[])
{
    Scanner obj=new Scanner(System.in);
    //String name,fname;
        int a,b,c,d,e,f,g;
    a=obj.nextInt();
    b=obj.nextInt();    
    c=obj.nextInt();
    d=a+b;
    e=a-b;
    f=a*b;
    g=a/b;
System.out.println("a= "+a);
System.out.println("b= "+b);
System.out.println("sum of no.s "+d);
System.out.println("difference of no.s "+e);
System.out.println("product of no.s "+f);
System.out.println("division of no.s "+g);
System.out.println("c= "+c);
System.out.println("post inc = "+c++);
System.out.println("pre inc= "+c);
System.out.println("b= "+b);
System.out.println("b= "+b);


//System.out.println(d);

    //System.out.println(fname);

/*System.out.println(b);
System.out.println(d);
System.out.println(c);*/
}
}