class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW = 0;
        int maxH = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int val1 = sizes[i][0];
            int val2 = sizes[i][1];
            
            if (val1 < val2) {
                int temp = val1;
                sizes[i][0] = val2;
                sizes[i][1] = temp;
            }
        }
        
        for (int i = 0; i < sizes.length; i++) {
            int val = sizes[i][0];
            
            if (maxW < val) {
                maxW = val;
            }
        }
        
        for (int i = 0; i < sizes.length; i++) {
            int val = sizes[i][1];
            
            if (maxH < val) {
                maxH = val;
            }
        }
        return maxW * maxH;
    }
}