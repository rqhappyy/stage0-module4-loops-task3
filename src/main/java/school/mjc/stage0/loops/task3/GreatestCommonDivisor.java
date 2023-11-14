package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public static void printGCD(int first, int second) {
        if (first!=0&&second!=0) {
            for (; second != 0; ) {
                if (first > second) {
                    first = first - second;
                } else {
                    second = second - first;
                }
            }
            System.out.println(first);
        }else{
           int result = Math.max(first, second);
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        printGCD(0, 30);
    }
}
