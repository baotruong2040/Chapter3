public class Ex9 {
    public static void main(String[] args) {
        int biggest=0;
        for (int i =1; i<=100; i++) {
            if (i%7==0) {
                biggest = i;
            }
        }
        System.out.println("the biggest number that divine in 7 without residual is: "+ biggest);
    }
}
