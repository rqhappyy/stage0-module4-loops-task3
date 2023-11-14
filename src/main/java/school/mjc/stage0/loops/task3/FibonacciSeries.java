package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);
        for (int j = 0; j < lastFibonacci-2;) {
                if(j<lastFibonacci-2){
                    c = a + b;
                    System.out.println(c);
                    j++;
                }
                if(j<lastFibonacci-2) {
                    a = b + c;
                    System.out.println(a);
                    j++;
                }
                if(j<lastFibonacci-2) {
                    b = a + c;
                    System.out.println(b);
                    j++;
                }
        }
    }
}
