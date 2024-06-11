class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_val = None
        diff = None

        stocks = []

        for i in range(len(prices)):
            val = prices[i]

            if min_val is None:
                min_val = val
                continue

            if min_val > val:
                min_val = val
            
            temp = val - min_val

            if diff is None:
                diff = temp
            if temp > 0:
                diff = None
                min_val = val
                if temp > 0:
                    stocks.append(temp)
            
        if len(stocks) <= 0:
            return 0
        else:
            return sum(stocks)
