package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static void revert(int number) {
        int num[] = new int[3];

        num[0] = number/100;
        num[1] = number/10 - num[0] * 10;
        num[2] = number - (num[0] * 100 + num[1] * 10);


        System.out.println(num[2]+""+num[1]+""+num[0]);
    }
}
