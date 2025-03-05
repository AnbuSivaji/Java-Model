import java.util.Scanner;

public class loop5

{

  public static void main(String args[])

   {

 Scanner Scan=new Scanner (System.in);
System.out.println("Enter the number");
   int b=Scan.nextInt();

     int num=0;
 for(int i=1;i<=b;i--)
num +=i;
System.out.println(num);

   }
     

}