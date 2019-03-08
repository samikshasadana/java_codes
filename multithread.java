import java.util.*;
//write public main class
public class multithread{
    public static void main(String arg[]){
        int a,b;
        t1 thd1=new t1();
        t2 thd2=new t2();
        thd1.start();
        //start is used to call void run.start will run once at a time but will crash the program because it is already working.
        thd2.start();
        Scanner o=new Scanner(System.in);
        while(true){
            a=o.nextInt();
            b=o.nextInt();
            int c=a+b;
            System.out.println(c);
        }
    }
}
class t1 extends Thread{
    //everything to be written in this function else wont work
    public void run(){
        int a=0;
        while(true){
            try{
                System.out.println(a);
                a++;
                Thread.sleep(2000);
            }
            catch(Exception e){ }
        }
     
    }
}
class t2 extends Thread{
    public void run(){
        int b=0;
        while(true){
            try{
                System.out.println(b);
                b--;
                Thread.sleep(2000);
            }
            catch(Exception e){ }
        }
     
    }
}
        
