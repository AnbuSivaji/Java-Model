public class Patterns {
    public static void main(String args[]) {
        int n = 5; // Number of rows
        
        for (int i = 1; i <= n; i++) {
            // Printing left triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Printing spaces for separation
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // Printing right-aligned mirrored triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
