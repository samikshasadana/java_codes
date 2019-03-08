import java.util.*;
class array_duplicate{
public static void main(String arg[]){
    int[] arr=new int[5];
    Scanner s=new Scanner(System.in);
    for(int i=0;i<5;i++){
       arr[i]=s.nextInt();
    }
    int n=5;
    for(int i=0;i<5;i++){
        for(int j=i+1;j<4;j++){
            if(arr[i]==arr[j]){
                arr[j]=arr[j+1];
                n--;
            }
        }
    }
    for(int i=0;i<n;i++){
       System.out.println(arr[i]);
    }
    
}
}