class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        boolean su = true;
        
        for (int i = 1; i <= n; i++) {
            if (su) {
                sb.append("수");
                su = false;
            } else {
                sb.append("박");
                su = true;
            }
        }
        return sb.toString();
    }
}