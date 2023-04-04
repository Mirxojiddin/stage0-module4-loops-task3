package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci>=1)
            System.out.println(0);
        if (lastFibonacci>=2)
            System.out.println(1);
        int first=0, second=1, last=1;
        for (int i=2; i<lastFibonacci; i++){
            System.out.println(last);
            int tempVar = last;
            last = second+first;
            first = second;
            second = tempVar; 
        }

    }
}
