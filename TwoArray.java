
    import java.util.Scanner;

public class TwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[][] = new int[3][3];
        int array2[][] = new int[3][3];
        int array3[][] = new int[3][3];
        System.out.println("Array 1:");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array 2:");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                array2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(array3[i][j] + " ");
            }
        }
}
}

