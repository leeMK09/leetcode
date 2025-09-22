import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[] {-1};
        List<Integer> answer = new ArrayList();
        
        Integer min = null;
        
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            
            if (min == null) {
                min = val;
            } else if (min > val) {
                min = val;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (min != arr[i]) {
                answer.add(arr[i]);
            }
        }
        return answer.stream()
            .mapToInt(i -> i)
            .toArray();
    }
}