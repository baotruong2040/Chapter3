public class Ex15 {

    public static void main(String[] args) {
        int n = 4;
        int d = 3;
         for (int i =1; i<=4; i++){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
        for (int u = 1; u <= (2*i)-1;u++) {
            System.out.print("*");
        }

        System.out.println();
        
        }
        for (int i = d; i >= 1; i--) {
            System.out.print(" ");
             //Copilot                                           
            for (int j = 0; j < d - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();                                      
        }

    }
}