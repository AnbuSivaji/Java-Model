import java.util.Scanner;

public class Even {
     public static void main(String args[]){
           Scanner scan=new Scanner(System.in);
           int num;
           int even_sum=0,odd_sum=0;
           
           do{
                System.out.println("Enter the number");
                num=scan.nextInt();
                if(num%2==0) even_sum+=num;
                else odd_sum+=num;
                num--;
           } while(num<0);
           System.out.println("The sum of even numbers is "+even_sum);
              System.out.println("The sum of odd numbers is "+odd_sum);

           scan.close(); 
     }
}
