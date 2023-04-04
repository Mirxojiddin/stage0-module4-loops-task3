package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int summ=0;
        int min = firstBoarder<secondBoarder?firstBoarder:secondBoarder;
        int max = firstBoarder>secondBoarder?firstBoarder:secondBoarder;
        for (int i=min; i<=max; i++)
            summ+=i;
        System.out.println(summ);
    }

    public static void main(String[] args) {
        RangeSum rangeSum = new RangeSum();
        rangeSum.printSumInclusive(100, 100);
    }
}
