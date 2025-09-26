class Solution {
    public String solution(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isWhitespace(c)) {
                count = 0;
                sb.append(String.valueOf(c));
            } else if (count % 2 == 0) {
                sb.append(String.valueOf(Character.toUpperCase(c)));
                count++;
            } else {
                sb.append(String.valueOf(Character.toLowerCase(c)));
                count++;
            }
        }
        
        return sb.toString();
    }
}