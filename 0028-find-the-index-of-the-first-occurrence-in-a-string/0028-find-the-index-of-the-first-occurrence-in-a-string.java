class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        int resultIdx = 0;
        boolean matched = false;
        char target = needle.charAt(0);
        for (int i = 0; i < haystack.length(); i++) {
            char c = haystack.charAt(i);

            if (target == c && (i + needle.length()) <= haystack.length()) {
                String compareStr = haystack.substring(i, (needle.length() + i));

                if (compareStr.equals(needle)) {
                    matched = true;
                    resultIdx = i;
                    break;
                }
            }
        }

        if (!matched) {
            return -1;
        }

        return resultIdx;
    }
}