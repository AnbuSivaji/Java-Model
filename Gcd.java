import java.util.Scanner;
public class Gcd {
      public static void main(String args[]){
            Scanner scan=new Scanner(System.in);
            int num1,num2;
            char choice='y';
            do{
              System.out.println("Enter the first number");
              num1=scan.nextInt();
              System.out.println("Enter the second number");
              num2=scan.nextInt();
              int gcd=1;
              for(int i=1;i<=num1 && i<=num2;i++){
                  if(num1%i==0 && num2%i==0){
                      gcd=i;
                  }
              }
              System.out.println("The GCD of "+num1+" and "+num2+" is "+gcd);
              System.out.println("Do you want to continue? (y/n)");
              choice=scan.next().charAt(0);
            } while(choice =='y');
            scan.close(); 
      }
    


    }

