class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        k = k % len(nums)

        nums[:] = nums[-k:] + nums[:-k]
        # for i in range(k):
        #     last_element = nums.pop()
        #     nums.insert(0, last_element)
        
        