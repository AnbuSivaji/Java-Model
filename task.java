import java.util.*;

public class task {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(  N<=20 ){
            System.out.println("Weird");
            
        }
        else {
            System.out.println("Not weird");
            
        } 
       
       
       
        scanner.close();
    }
}


