class Solution {
    public String solution(String s) {
        int lo = 0;
        int hi = s.length();
        
        int mid = (lo + hi) / 2;
        
        if (s.length() % 2 == 0) {
            return s.substring(mid - 1, mid + 1);
        }
    
        return s.charAt(mid) + "";
    }
}