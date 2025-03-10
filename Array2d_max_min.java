import java.util.Scanner;


public class Array2d_max_min {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println ("Enter the elements of the matrix: ");
        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("The maximum element in the matrix is: "+max);
        System.out.println("The minimum element in the matrix is: "+min);
    }    
}
