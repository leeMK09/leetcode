# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        p_arr = []
        q_arr = []
        
        def search(node, arr):
            if not node:
                arr.append(None)
                return 
            else:
                arr.append(node.val)

            search(node.left, arr)
            search(node.right, arr)
        
        search(p, p_arr)
        search(q, q_arr)

        if len(p_arr) != len(q_arr):
            return False
        
        for i in range(len(p_arr)):
            p_val = p_arr[i]
            q_val = q_arr[i]

            if p_val != q_val:
                return False
        
        return True
                

        