class Solution {
    public long solution(long n) {
        long answer = 0;
        long lo = 1;
        long hi = n;
        
        while (lo <= hi) {
            long mid = lo + ((hi - lo) / 2);
            
            if (mid <= n / mid) {
                answer = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        
        if (answer * answer == n) {
            return (answer + 1) * (answer + 1);
        }
        
        return -1;
    }
}