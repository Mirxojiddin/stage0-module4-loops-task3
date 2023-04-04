package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int len =0, sumDigit=0;
        t=t<0?t*-1:t;
        int tt=t;
        for (int i=0; i<tt; i++){
            len++;
            t=t/10;    
            if (t==0)
                break;
        }
        for (int i=0; i<len; i++){
            sumDigit += tt%10;
            tt/=10;
        }
        System.out.println(sumDigit);
    }
}
