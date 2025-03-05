import java.util.Scanner;

public class Lowercase {
    public static void main(String args[]){
           Scanner scan=new Scanner(System.in);
             char choice='y';
           do{
             System.out.println("Enter your choice");
             choice=scan.next().charAt(0);
              int ele=choice-0;
                if(ele>=65 && ele<=90){
                    System.out.println("The entered character is uppercase") ;
                }
                else{
                    System.out.println("The entered character is lowercase");
                }
           } while(choice =='y');
           scan.close(); 

        
    }
    
}
