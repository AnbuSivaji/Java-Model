import java.util.Scanner;

public class LinearSearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]=new int[5];
        for(int i=0;i<5;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int search=sc.nextInt();
        int flag=0;
        for(int i=0;i<5;i++)
        {
            if(num[i]==search)
            {
                System.out.println("Element found at position "+(i+1));
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Element not found");
        }
     }
    
    }
