class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_val = None
        diff = None

        for i in range(len(prices)):
            val = prices[i]

            if min_val is None:
                min_val = val
                continue
            
            if min_val > val:
                min_val = val
            
            if diff is None:
                diff = val - min_val
                continue
            
            temp_diff = val - min_val

            if diff < temp_diff:
                diff = temp_diff

        if diff is None:
            return 0

        return diff