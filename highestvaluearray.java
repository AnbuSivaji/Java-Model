import java.util.Scanner;

public class highestvaluearray {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max)
            {
                max=array[i];
            }
        }

        System.out.println("Max:"+max);
   }
    
}
