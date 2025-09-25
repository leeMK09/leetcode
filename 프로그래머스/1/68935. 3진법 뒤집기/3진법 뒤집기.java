class Solution {
    public int solution(int n) {
        int rest = n;
        StringBuilder sb = new StringBuilder();
        
        while (rest != 0) {
            int slice = rest % 3;
            rest = rest / 3;
            sb.append(String.valueOf(slice));
        }
        char[] ch = sb.toString().toCharArray();
        
        int multi = 0;
        int answer = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            int val = ch[i] - '0';
            int digit = (int) Math.pow(3, multi);
            answer = answer + (val * digit);
            multi++;
        }
        
        return answer;
    }
}