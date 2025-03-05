import java.util.Scanner;

public class whileloop

{

  public static void main(String args[])

   {

 Scanner Scan=new Scanner (System.in);
System.out.println("Enter the number");
   int i=Scan.nextInt();
int sum=0;
int oriNum=i;



  while(i !=0){
          
int digit=i %10;
     i=i/10;
 sum=sum*10+digit;


    
 }
  System.out.println("Sum of digits :"+sum);

if(oriNum==sum){
 System.out.println("Parlindrom");

}
else{
   System.out.println("not parlimondrom");
 
}

   }
   

}