class Solution {
    public int[] solution(int n, int m) {
        int gcd = 0;
        int nval = n;
        int mval = m;
        
        while (gcd == 0) {
            if (nval >= mval) {
                int mod = nval % mval;
                if (mod == 0) {
                    gcd = mval;
                    break;
                }
                
                nval = mval;
                mval = mod;
            } else {
                int temp = nval;
                nval = mval;
                mval = temp;
            }
        }
        
        int ncm = (n * m) / gcd;
        int[] answer = {gcd, ncm};
        return answer;
    }
}