class Solution:
    def maximumCount(self, nums: List[int]) -> int:
        nCount = self.binarySearchNeg(nums)
        pCount = self.binarySearchPos(nCount, nums)      
        return max(nCount, pCount)

    def binarySearchNeg(self, nums: List[int]) -> int:
        left = 0
        right = len(nums) - 1

        while left <= right:
            mid = (left + right) // 2
            if nums[mid] < 0:
                left = mid + 1
            else:
                right = mid - 1
        return left
    
    def binarySearchPos(self, leftCount: int, nums: List[int]) -> int:
        left = leftCount
        right = len(nums) - 1

        while left <= right:
            mid = (left + right) // 2
            if nums[mid] <= 0:
                left = mid + 1
            else:
                right = mid - 1
        return len(nums) - (right + 1)
        

         