package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int temp;
        int result = 0;
        while (number > 0) {
            temp = number % 10;
            result = (result * 10) + temp;
            number = number / 10;
        }
        System.out.println(result);
    }
}
