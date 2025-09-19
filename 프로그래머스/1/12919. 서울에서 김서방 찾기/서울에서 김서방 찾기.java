class Solution {
    public String solution(String[] seoul) {
        boolean find = false;
        int pos = 0;
        
        while (!find) {
            String ele = seoul[pos];
            
            if (ele.equals("Kim")) {
                find = true;
                break;
            }
            
            pos++;
        }
        
        return "김서방은 " + pos + "에 있다";
    }
}