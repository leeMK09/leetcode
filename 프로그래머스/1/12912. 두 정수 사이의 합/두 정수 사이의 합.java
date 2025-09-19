class Solution {
    public long solution(int a, int b) {
        if (a == b) return a;
        
        long sum = 0;
        
        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
        }
        
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}