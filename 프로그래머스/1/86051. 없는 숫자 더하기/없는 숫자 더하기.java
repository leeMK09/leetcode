class Solution {
    public int solution(int[] numbers) {
        boolean[] countMap = new boolean[10];
        
        for (int i = 0; i < numbers.length; i++) {
            int val = numbers[i];
            countMap[val] = true;
        }
        
        int sum = 0;
        for (int i = 0; i < countMap.length; i++) {
            if (!countMap[i]) {
                sum += i;
            }
        }
        return sum;
    }
}