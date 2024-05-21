class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        s_point = 0
        t_point = 0
        order_arr = []

        if len(s) == 0:
            return True

        for i in range(len(t)):
            if s_point == len(s):
                break
            target = s[s_point]

            if t[i] == target:
                order_arr.append(t[i])
                s_point += 1

        joined = ''.join(order_arr)

        return joined == s
