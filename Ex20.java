public class Ex20 {
    public static void main(String[] args) {
        long number, result;
        number = 6;
        result = factorial(number);
        System.out.println("The factorial of 6 is: "+result);
    }

    private static long factorial(long value) {
        long result = 1;
        //the missing line: (copilot)
        for (long i =1 ; i<=value; i++) {
            result = result*i;
        }
    
        return result;
    }
}
