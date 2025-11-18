import java.util.List;
import java.util.ArrayList;

class Solution {
    private List<int[]> moves = new ArrayList<>();
    
    public int[][] solution(int n) {
        hanoi(n, 1, 3, 2);
        int[][] answer = new int[moves.size()][2];
        for (int i = 0; i < moves.size(); i++) {
            answer[i] = moves.get(i);
        }
        return answer;
    }
    
    public void hanoi(int n, int start, int end, int aux) {
        if (n == 1) {
            moves.add(new int[]{start, end});
        } else {
            hanoi(n - 1, start, aux, end);
            moves.add(new int[]{start, end});
            hanoi(n - 1, aux, end, start);
        }
    }
}