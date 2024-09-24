//Copy Copilot
public class Ex13 {
    public static void main(String[] args) {
        int n = 7; // Number of rows

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < Math.abs(n / 2 - i); j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < n - 2 * Math.abs(n / 2 - i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
