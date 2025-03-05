import java.util.Scanner;

public class armstrong

{

  public static void main(String args[])

   {

 Scanner Scan=new Scanner (System.in);
System.out.println("Enter the number");
   int i=Scan.nextInt();
        
   int val=0;



  while(i!=0){
          int rem=i%10;
      val +=(rem*rem*rem);
       i=i/10;

 
    
 }
System.out.println(val);
   }
   

}