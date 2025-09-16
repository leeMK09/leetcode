class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long step = x;
        long cur = x;
        
        for (int i = 0; i < n; i++) {
            answer[i] = cur;
            cur += step;
        }
        return answer;
    }
}