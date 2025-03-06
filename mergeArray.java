
public class mergeArray {
     public static void main(String[] args) {
            int array1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int array2[] = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
            int array3[] = new int[array1.length + array2.length];
            int k = 0;
            for (int i = 0; i < array1.length; i++) {
                array3[k] = array1[i];
                k++;
            }
            for (int i = 0; i < array2.length; i++) {
                array3[k] = array2[i];
                k++;
            }
            System.out.println("Merged array:");
            for (int i = 0; i < array3.length; i++) {
                System.out.print(array3[i]+"   ");
            }
     }
     
}
