import java.util.Scanner;

public class Pattern4 {
     
    public static void main(String args[]){
            Scanner scan=new Scanner (System.in);
          int n=scan.nextInt();  
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                for(int k=1;k<=j;k++)

                System.out.print("* ");
            }
              System.out.println( );

   }
             
}

}
