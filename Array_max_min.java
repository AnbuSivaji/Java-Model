import java.util.Arrays;
import java.util.Scanner;

public class Array_max_min {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The maximum element in the array is: "+arr[arr.length-1]);
        System.out.println("The minimum element in the array is: "+arr[0]);
    }
    
}
