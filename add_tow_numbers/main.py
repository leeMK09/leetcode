# Definition for singly-linked list.
class ListNode:
     def __init__(self, val=0, next=None):
         self.val = val
         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        result_list_node = None
        comp1 = []
        temp1 = l1
        comp2 = []
        temp2 = l2

        while (temp1 is not None):
            comp1.append(temp1.val)
            temp1 = temp1.next

        while (temp2 is not None):
            comp2.append(temp2.val)
            temp2 = temp2.next

        comp1.reverse()
        comp2.reverse()

        result1 = int(''.join(map(str, comp1)))
        result2 = int(''.join(map(str, comp2)))
        total = result1 + result2

        total_result = [int(digit) for digit in str(total)]
        total_result.reverse()
        point = result_list_node
        for i in range(len(total_result)):
            if (i == 0):
                result_list_node = ListNode(total_result[i])
                point = result_list_node
            else:
                point.next = ListNode(total_result[i])
                point = point.next
        
        return result_list_node


        