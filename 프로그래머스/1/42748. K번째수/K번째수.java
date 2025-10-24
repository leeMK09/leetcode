import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int start = command[0];
            int end = command[1];
            int k = command[2];
            
            int[] arr = Arrays.copyOfRange(array, start - 1, end);
            
            for (int a = 0; a < arr.length - 1; a++) {
                for (int b = 0; b < arr.length - 1 - a; b++) {
                    int val1 = arr[b];
                    int val2 = arr[b + 1];
                    
                    if (val1 > val2) {
                        arr[b + 1] = val1;
                        arr[b] = val2;
                    }
                }
            }
            
            answer.add(arr[k - 1]);
        }
        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}