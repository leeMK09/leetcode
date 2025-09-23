class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int first = (int) arr[j];
                int second = (int) arr[j + 1];
                
                if (first < second) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return new String(arr);
    }
}