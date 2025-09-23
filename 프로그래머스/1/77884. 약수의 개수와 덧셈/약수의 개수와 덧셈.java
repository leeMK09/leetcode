class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            int divisorCount = getDivisorCount(i);
            
            if (divisorCount % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
    
    public int getDivisorCount(int val) {
        int sum = 0;
        for (int i = 1; i <= val; i++) {
            if (val % i == 0) {
                sum++;
            }
        }
        return sum;
    }
}