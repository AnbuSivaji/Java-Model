import java.util.Scanner;


public class Bitwise {

     public static void main(String args[]){
          
        Scanner sc=new Scanner(System.in);
       
        // Bitwise AND operation
        System.out.println("Enter the number 1 : ");
        int A=sc.nextInt();
        System.out.println("Enter the number 2 : ");
        int B=sc.nextInt();
        
        int result = A & B ;
        System.out.println("Result of Bitwise AND operation : "+result);
        

            // Bitwise OR operation
        System.out.println("Enter the number 3 : ");
        int C=sc.nextInt();
        System.out.println("Enter the number 4 : ");
        int D=sc.nextInt();
        
        result =C|D;
        System.out.println("Result of Bitwise OR operation : "+result);
    

        // Bitwise XOR operation
        System.out.println("Enter the number 5 : ");
        int E=sc.nextInt();
        System.out.println("Enter the number 6 : ");
        int F=sc.nextInt();
        
        result=E^F;
        System.out.println("Result of Bitwise XOR operation : "+result);
       


         // Bitwise NOT operation
        System.out.println("Enter the number 7 : ");
        int G=sc.nextInt();
        result=~G;
        System.out.println("Result of Bitwise NOT operation : "+result);    
   
   
        sc.close();

     }
    
}
