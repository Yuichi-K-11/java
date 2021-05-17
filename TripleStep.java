import java.util.*;

class TripleStep
{
    public static void main (String[] args) throws java.lang.Exception
    {
        for(int i=1; i<40; ++i) {
            System.out.printf("%2d:%d\n", i,  countWays(i) );
        }
    }

    private static int countWays(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return countWays(n, memo);
    }

    private static int countWays(int n, int[] memo) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (memo[n] > -1) {
            return memo[n];
        } else {
            memo[n] = countWays(n - 1, memo) + countWays(n - 2, memo) +
            countWays(n - 3, memo);
            return memo[n];
        }
    }
}
