package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String result = Integer.toString(t);
        int number = 0;
        int a = 0;
        for(int i = result.length()-1; i>=0; i--){
            number = t/(int)Math.pow(10, i)%10;
            a = a + number;
        }
        if(a<0){
            System.out.println(-a);
        }else{
            System.out.println(a);
        }
    }
}
