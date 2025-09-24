class Solution {
    public boolean solution(String s) {
        int n = s.length();
        if (n != 4 && n != 6) return false;
        boolean answer = true;
        
        for (int i = 0; i < n; i++) {
            int val = s.charAt(i) - '0';
            
            if (val < 0 || val > 9) {
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}