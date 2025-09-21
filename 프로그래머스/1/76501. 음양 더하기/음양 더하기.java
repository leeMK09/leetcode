class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
            int val = absolutes[i];
            boolean sign = signs[i];
            
            if (sign) {
                answer += val;
            } else {
                answer -= val;
            }
        }
        return answer;
    }
}