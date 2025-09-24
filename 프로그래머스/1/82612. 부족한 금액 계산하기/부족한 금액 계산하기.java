class Solution {
    public long solution(int price, int money, int count) {
        long fee = 0;
        
        for (int i = 1; i <= count; i++) {
            fee = fee + (price * i);
        }
        
        long answer = money - fee;
        
        if (answer > 0) return 0;

        return -answer;
    }
}