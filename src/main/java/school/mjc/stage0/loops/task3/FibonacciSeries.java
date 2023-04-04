package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first=1, second=1, last=2;
        if (lastFibonacci>0)
            System.out.println(0);
        if (lastFibonacci>1)
            System.out.println(1);
        if (lastFibonacci>=2)
            System.out.println(1);
        for (int i=3; i<lastFibonacci; i++){
            System.out.println(last);       
            first=second;
            second=last;
            last = first+second;
        }
    }
    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.printFibonacci(6);
    }
}
