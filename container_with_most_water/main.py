class Solution:
    def maxArea(self, height: List[int]) -> int:
        head = 0
        tail = len(height) - 1
        arr1 = []
        
        while head < tail:
            head_num = height[head]
            tail_num = height[tail]
            min_num = 0

            if head_num > tail_num:
                min_num = tail_num
                tail -= 1
            else:
                min_num = head_num
                head += 1
            
            re = ((tail - head) + 1) * min_num
            arr1.append(re)

        max_value = max(arr1)

        return max_value


            

            


        