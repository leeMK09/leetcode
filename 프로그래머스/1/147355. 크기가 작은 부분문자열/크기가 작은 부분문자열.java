import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String t, String p) {
        boolean end = false;
        int i = 0;
        int n = p.length();
        int answer = 0;
        
        while (!end) {
            if (i + n > t.length()) {
                end = true;
                break;
            }
            
            String sub = t.substring(i, i + n);
            i++;
            
            if (Long.parseLong(sub) <= Long.parseLong(p)) {
                answer++;
            }
        }
        
        return answer;
    }
}