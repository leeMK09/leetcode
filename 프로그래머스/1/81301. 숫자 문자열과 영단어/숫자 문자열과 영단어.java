import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String s) {
        Map<Character, ArrayList<String>> alphabetMap = new HashMap<>() {{
            put('z', new ArrayList<>(List.of("zero")));
            put('o', new ArrayList<>(List.of("one")));
            put('t', new ArrayList<>(List.of("two", "three")));
            put('f', new ArrayList<>(List.of("four", "five")));
            put('s', new ArrayList<>(List.of("six", "seven")));
            put('e', new ArrayList<>(List.of("eight")));
            put('n', new ArrayList<>(List.of("nine")));
        }};
        
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)) {
                sb.append(ch);
                i++;
            } else if (alphabetMap.containsKey(ch)){
                ArrayList<String> list = alphabetMap.get(ch);
                
                final int idx = i;
                String matchedWord = list.stream()
                    .filter(word -> s.startsWith(word, idx))
                    .findFirst()
                    .orElse(null);
                
                if (matchedWord != null) {
                    sb.append(wordToDigit(matchedWord));
                    i += matchedWord.length();
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
    
    private int wordToDigit(String word) {
        return switch (word) {
                case "zero" -> 0;
                case "one" -> 1;
                case "two" -> 2;
                case "three" -> 3;
                case "four" -> 4;
                case "five" -> 5;
                case "six" -> 6;
                case "seven" -> 7;
                case "eight" -> 8;
                case "nine" -> 9;
                default -> -1;
            };
    }
}