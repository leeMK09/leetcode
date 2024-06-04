class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 0
        dup = []

        while i < len(nums):
            val = nums[i]

            if i == 0:
                i += 1
                continue
            
            if val in dup:
                nums.remove(val)
            elif nums[i - 1] == val:
                dup.append(val)
                i += 1
            else:
                i += 1

            


        