import java.util.*;
class multiarray{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int[][] a= new int[3][3];
        for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            a[i][j]=s.nextInt();
        }
        }
        for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            System.out.print(a[i][j]);
        }
            System.out.println("");
        }
        
    }
}
