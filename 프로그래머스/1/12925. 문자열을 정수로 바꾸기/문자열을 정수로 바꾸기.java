class Solution {
    public int solution(String s) {
        boolean isNegative = false;
        char compare = s.charAt(0);
        if (compare == '-') {
            isNegative = true;
            s = s.substring(1);
        } else if (compare == '+') {
            s = s.substring(1);
        }
        
        int step = (int) Math.pow(10, s.length() - 1);
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - '0';
            answer += val * step;
            step = step / 10;
        }
        
        if (isNegative) return -answer;
        
        return answer;
    }
}