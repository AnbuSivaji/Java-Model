
import java.util.Scanner;


public abstract class Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[5];
        for(int i=0;i<5;i++)
        {
            num[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(num[i]);
        }
        System.out.println("length of array is "+num.length);
    }
}
