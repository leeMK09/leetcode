class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                indexList.add(i);
            }
        }
        int lastIndex = 0;

        if (!indexList.isEmpty()) {
            lastIndex = indexList.getLast();
        }
        List<String> strings = new ArrayList<>();
        List<Character> characters = new ArrayList<>();
        for (int i = lastIndex; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ') {
                characters.add(c);
            } else if (!characters.isEmpty()) {
                String str = charsToString(characters);
                strings.add(str);
                characters.clear();
            }

            if ((i + 1) == s.length()) {
                String str = charsToString(characters);
                strings.add(str);
                characters.clear();
            }
        }

        int max = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++) {
            int size = strings.get(i).length();

            if (size > max) {
                max = size;
            }
        }

        return max;
    }

    public String charsToString(List<Character> chs) {
        StringBuilder sb = new StringBuilder();
        for (Character ch : chs) {
            sb.append(ch);
        }
        return sb.toString();
    }
}