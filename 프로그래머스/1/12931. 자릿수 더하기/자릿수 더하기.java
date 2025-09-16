import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int remainNum = n;
        
        while (remainNum > 0) {
            answer += (remainNum % 10);
            remainNum = (remainNum / 10);
        }

        return answer;
    }
}