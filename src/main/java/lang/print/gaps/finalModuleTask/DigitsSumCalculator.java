package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void calculateSum(int number) {
        int first = number/1000;
        int second = (number-first*1000)/100;
        int third = (number-(first * 1000 + second * 100))/10;
        int four = number-(first * 1000 + second * 100 + third * 10);
        System.out.println(first+second+third+four);
    }
}
