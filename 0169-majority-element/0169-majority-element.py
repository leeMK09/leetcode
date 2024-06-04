class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        max_val = 0
        cnt_val = 0
        cnt = 0
        nums.sort()

        if len(nums) == 1:
            return nums[0]

        for i in range(len(nums)):
            val = nums[i]

            if i == 0:
                continue
            
            if nums[i - 1] == val:
                cnt += 1
            else:
                cnt = 0

            if cnt >= 1:
                if cnt_val == 0:
                    cnt_val = cnt
                    max_val = val
                elif cnt_val <= cnt:
                    cnt_val = cnt
                    max_val = val

        return max_val