import java.util.*;
public class abc{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
         int digit = 0,count=0;
        for(int i = 0; i < s.length(); i++)
        {
            switch (s.toUpperCase().charAt(i))
            {
                case 'A': 
                case 'B': 
                case 'C': digit = 2; count++;
                break;
                case 'D': 
                case 'E': 
                case 'F':  digit = 3; count++;
                break;    
                case 'G': 
                case 'H':  
                case 'I': digit = 4; count++;
                break;
                case 'J': 
                case 'K':  
                case 'L': digit = 5; count++;
                break;
                case 'M': 
                case 'N':  
                case 'O': digit = 6; count++;
                break;
                case 'P': 
                case 'Q': 
                case 'R': 
                case 'S': digit = 7; count++;
                break;
                case 'T':  
                case 'U': 
                case 'V': digit = 8; count++;
                break;
                case 'W': 
                case 'X':  
                case 'Y': 
                case 'Z': digit = 9; count++;
                break;
            }
            if(count==3){      
            System.out.print(digit);
            }
        }
        System.out.println();
}
}