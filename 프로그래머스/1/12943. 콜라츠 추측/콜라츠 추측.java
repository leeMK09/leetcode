class Solution {
    public int solution(int num) {
        if (num == 1) return 0;
        boolean enough = false;
        int count = 0;
        long ctx = num;
        
        while (!enough) {
            count++;
            
            if (ctx % 2 == 0) {
                ctx /= 2;
            } else {
                ctx *= 3;
                ctx++;
            }
            
            if (ctx == 1) {
                enough = true;
                break;
            } else if (count >= 500) {
                enough = true;
                break;
            }
        }
        
        if (count >= 500) return -1;
        
        return count;
    }
}