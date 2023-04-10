package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int temp;
        int result = 0;
        while (number > 0) {
            temp = number % 10;
            result += temp;
            number /= 10;
        }
        System.out.println(result);
    }
}
