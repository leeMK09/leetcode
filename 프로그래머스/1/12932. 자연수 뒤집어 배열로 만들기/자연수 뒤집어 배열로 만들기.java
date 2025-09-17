import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(long n) {
        List<Integer> temp = new ArrayList();
        
        while (n > 0) {
            int remain = (int) (n % 10);
            n = n / 10;
            
            temp.add(remain);
        }
        
        int[] answer = new int[temp.size()];
        
        for (int i = 0; i < temp.size(); i ++) {
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}