class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        int matchedLastIdx = strs[0].length() - 1;
        String matchedStr = strs[0];
        boolean isMatched = false;

        for (int i = 1; i < strs.length; i++) {
            String targetStr = strs[i];
            if (matchedLastIdx > targetStr.length() - 1) {
                matchedLastIdx = targetStr.length() - 1;
            }

            int targetIdx = 0;
            int matchedIdx = 0;
            while (matchedIdx < (matchedLastIdx) + 1) {
                if (matchedStr.charAt(matchedIdx) == targetStr.charAt(targetIdx)) {
                    matchedIdx++;
                    targetIdx++;
                } else {
                    matchedLastIdx = targetIdx - 1;
                }
            }

            if (matchedIdx > 0) {
                isMatched = true;
            }
        }

        if (!isMatched) return "";

        String result = "";

        for (int i = 0; i <= matchedLastIdx; i++) {
            result += matchedStr.charAt(i);
        }

        return result;
    }
}