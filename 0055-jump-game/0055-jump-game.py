class Solution:
    def canJump(self, nums: List[int]) -> bool:
        find = []
        passed = []
        max_list = []

        if len(nums) == 1:
            return True

        for i in range(len(nums)):
            val = nums[i]

            if val == 0:
                if i + 1 != len(nums):
                    next_val = nums[i + 1]
                    if next_val == 0:
                        continue
                    else:
                        find.append(i)
                else:
                    find.append(i)
        
        if len(find) == 0:
            return True
        
        for i in range(len(find)):
            prev = i

            if i != 0:
                prev = find[i - 1] + 1
            split_idx = find[i]
            splited_list = nums[prev:split_idx]
            splited = [x for x in splited_list if x != 0]
            zero_splited = [x for x in splited_list if x == 0]
            last_max = 0

            if len(max_list) !=0:
                last_max = max_list[-1]
            
            if len(splited) == 0:
                return False
            
            last_val = splited[-1]

            zero_len = len(zero_splited) + 1

            max_val = splited[0]
            max_index = i
            for i in range(len(splited)):
                val = splited[i]

                if val >= max_val:
                    max_val = val
                    max_index = i
            max_list.append(max_val)

            max_splited = splited_list[max_index:split_idx]
            if (split_idx == len(nums) - 1) and (len(max_splited) <= max_val or len(splited) >= split_idx):
                passed.append(True)
            elif len(splited_list) < max_val or len(max_splited) < max_val or zero_len < last_val or len(splited_list) + 2 < last_max:
                passed.append(True)
            else:
                return False

        return len(find) == len(passed)
            
        