class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String input = x + "";
        int half = input.length() / 2;
        int firstIdx = 0;
        int lastIdx = input.length() - 1;
        int cnt = 0;

        for (int i = 0; i < half; i++) {
            if (input.charAt(firstIdx) == input.charAt(lastIdx)) {
                cnt++;
            }
            firstIdx++;
            lastIdx--;
        }

        return cnt == half;
    }
}