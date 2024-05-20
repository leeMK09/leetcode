class Solution:
    def isPalindrome(self, s: str) -> bool:
        result = s.lower()

        for char in result:
            if not char.isalnum():  
                result = result.replace(char, " ")

        result = result.replace(" ", "")

        if len(result) == 0:
            return True
        
        if len(result) == 1:
            return True
        
        head = 0
        tail = len(result) - 1
        half = len(result) // 2

        for i in range(len(result)):
            head_str = result[head]
            tail_str = result[tail]

            if head == half:
                return True

            if head_str == tail_str:
                head += 1
                tail -= 1
                print(head_str, tail_str)
            else:
                head = 0
                return False

        return head == half
        