
import java.util.Scanner;

public abstract class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }

        System.out.println("Sum:"+sum);
    }

}

