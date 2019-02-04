import java.util.*;
class conditional{
    public static void main(String arg[]){
        System.out.println("enter a number");
        Scanner o=new Scanner(System.in);
        int a;
        a=o.nextInt();
        if(a>=100)
        {
            System.out.println("number is greater than 100");
        }
    else{
    System.out.println("number is less than 100");
    }
    }
}