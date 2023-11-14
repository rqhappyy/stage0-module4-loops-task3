package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        String a = "";
        int b = 0;
        int result = 0;
            for (int i = 0; i < lengthOfLastNumber; i++) {
                a = a + "9";
                b = Integer.parseInt(a.trim());
                result = result + b;
            }
        System.out.println(result);
    }
}
