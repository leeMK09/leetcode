class Solution {
    public int removeElement(int[] nums, int val) {
        int matchedCount = 0;
        List<Integer> unmatchedInt = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int numVal = nums[i];

            if (val != numVal) {
                matchedCount++;
                unmatchedInt.add(numVal);
            }
        }

        for (int i = 0; i < unmatchedInt.size(); i++) {
            int iVal = unmatchedInt.get(i).intValue();

            nums[i] = iVal;
        }

        return matchedCount;
    }
}