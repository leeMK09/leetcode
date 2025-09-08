class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int result = 0;
        boolean bounded = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                result = mid;
                bounded = true;
                break;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            }
        }

        if (bounded) return result;
        return low;
    }
}