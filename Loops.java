import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
             char choice='y'; 
            
        do { 
            System.out.println("Enter your chice");
             choice=scan.next().charAt(0);  
        } while (choice !='y');
        scan.close();
    }
}
