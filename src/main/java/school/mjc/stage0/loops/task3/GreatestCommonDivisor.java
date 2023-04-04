package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int min = first<second?first:second;
        int max = first>second?first:second;
        if (min==0)
            System.out.println(max);
        for (int j=min; j>0; j--)
            if (min%j==0 && max%j==0){
                System.out.println(j);
                break;
            }
    }
}
