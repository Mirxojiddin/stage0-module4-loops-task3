package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int one = 1;
        int summ=0;
        for (int i=0; i<lengthOfLastNumber; i++){
            summ+=one*9;
            one=one*10+1;
        }
        System.out.println(summ);
    }
}
