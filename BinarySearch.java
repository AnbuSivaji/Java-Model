
public class BinarySearch {
    public static void main(String[] args) {
        int array[] = { 1, 2, 5, 6, 8, 9 };

        int ele = 8;

        int start = 0, end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == ele) {
                System.out.println("Element found at index :" + mid);
                break;
            } else {
                if (array[mid] < ele)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
 }
}
}