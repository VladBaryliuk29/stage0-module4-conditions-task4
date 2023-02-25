package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void stop(){}
    public void printGreatest(int first, int second, int third) {
        int greatest = first >= second && first >= third
                ? first:
                Math.max(second, third);
        System.out.println(greatest);
    }
}
