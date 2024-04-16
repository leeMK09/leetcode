class Solution:
    def twoSum(self, nums: List[int], target: int) :
        nums_dict = {}
        result = []
        for i, value in enumerate(nums):
            temp = sorted([value, target - value])
            key = str(temp[0]) + str(temp[1])
            if key in nums_dict: 
                nums_dict[key].append(i)
                if nums[nums_dict[key][0]] + nums[nums_dict[key][1]] == target:
                    result = nums_dict[key]
                    break
                else:
                    continue     
            else:
                nums_dict[key] = [i]
        return result
        


        