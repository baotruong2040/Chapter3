public class Ex18 {
    //Copilot
    public static void main(String[] args) {
        int[] series = new int[10];
        series[0] = 1; // First term
        series[1] = 7; // Second term

        for (int i = 2; i < series.length; i++) {
            series[i] = series[i - 1] + (series[i - 1] - series[i - 2]) + (i - 1) * 3;
        }

        for (int number : series) {
            System.out.println(number);
        }
    }
}
