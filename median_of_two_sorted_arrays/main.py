class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums1.extend(nums2)
        nums1.sort()
        medium = math.floor(len(nums1) / 2)
        
        if (len(nums1) % 2 == 0): 
            m1 = nums1[medium]
            m2 = nums1[medium - 1]
            return (m1 + m2) / 2
        else:
            return nums1[medium]