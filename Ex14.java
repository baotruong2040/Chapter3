public class Ex14 {

    public static void main(String[] args) {
        int n = 4;
        for (int i =1; i<=4; i++){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
        for (int u = 1; u <= (2*i)-1;u++) {
            System.out.print("*");
        }

        System.out.println();
        
        }
    }
}