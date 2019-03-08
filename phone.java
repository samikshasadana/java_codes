import java.util.*;
class phone{
   public static void main(String args[])	
        {
	int n;
	n=(int)(Math.random()*26+1);
	System.out.println("Number generated:" +n);
	System.out.println("Converted number:"+(char)(64+n));
	int i=2,x=0;
	char a='A';
	while(i<=n)
	 {
	  a++;
	  i++;
	 }
       System.out.println(a);
	
switch(a)
{	case 'A':
	case 'B':
	case 'C':
	{
	x=2;
	break;
	}
	case 'D':
	case 'E':
	case 'F':
	{
	x=3;
	break;
	}
	case 'G':
	case 'H':
	case 'I':
	{
	x=4;
	break;
	}
	case 'J':
	case 'K':
	case 'L':
	{
	x=5;
	break;
	}
	case 'M':
	case 'N':
    case 'O':
	{
	x=6;
	break;
	}
	case 'P':
	case 'Q':
	case 'R':
 {
	x=7;
	break;
	}
	case 'S':
	case 'T':
	case 'U':
	case 'V':
	{
	x=8;
	break;
	}
	case 'W':
	case 'X':
	case 'Y':
	case 'Z':
	{
	x=9;
	break;
	}
}
System.out.println("Keypad Number:"+x);	
	
}}