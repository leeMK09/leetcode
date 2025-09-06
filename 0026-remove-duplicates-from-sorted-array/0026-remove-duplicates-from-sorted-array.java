class Solution {
    public int removeDuplicates(int[] nums) {
        int cur = 0;
        boolean isStart = false;
        List<Integer> duplicated = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (!isStart) {
                cur = val;
                duplicated.add(val);
                isStart = true;
            } else {
                if (cur != val) {
                    cur = val;
                    duplicated.add(val);
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < duplicated.size()) {
                nums[i] = duplicated.get(i).intValue();
            }
        }

        return duplicated.size();
    }
}