import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            
            if (val % divisor == 0) {
                int insertIndex = findInsertIndex(answer, val);
                
                answer.add(insertIndex, val);
            }
        }
        
        if (answer.isEmpty()) return new int[] {-1};
        
        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
    
    public int findInsertIndex(List<Integer> arr, int val) {
        if (arr.isEmpty()) return 0;
        
        int lo = 0;
        int hi = arr.size();
        
        while (lo < hi) {
            int mid = lo + ((hi - lo) / 2);
            
            if (arr.get(mid) < val) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        
        return lo;
    }
}