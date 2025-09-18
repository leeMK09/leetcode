class Solution {
    public long solution(long n) {
        int[] count = new int[10];
        
        while (n > 0) {
            int val = (int) (n % 10);
            count[val]++;
            n = n / 10l;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (count[i]-- > 0) {
                sb.append(i);
            }
        }
        return Long.parseLong(sb.toString());
    }
}