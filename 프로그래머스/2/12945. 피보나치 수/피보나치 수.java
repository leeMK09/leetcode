import java.util.Arrays;

class Solution {
    private long[] memo;
    
    public long solution(int n) {
        memo = new long[n + 1];
        Arrays.fill(memo, -1);
        return f(n);
    }
    
    public long f(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = f(n - 1) + f(n - 2);
        return memo[n] % 1234567;
    }
}