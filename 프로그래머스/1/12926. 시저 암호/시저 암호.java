class Solution {
    public String solution(String s, int n) {
        char[] bigs = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] lowers = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == ' ') {
                sb.append(' ');
                continue;
            }
            
            if (Character.isUpperCase(ch)) {
                int index = findIndex(bigs, ch);
                char next = bigs[(index + n) % bigs.length];
                sb.append(next);
            } else {
                int index = findIndex(lowers, ch);
                char next = lowers[(index + n) % lowers.length];
                sb.append(next);
            }
        }
        
        return sb.toString();
    }
    
    private int findIndex(char[] arr, char target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}