# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        depth = 0

        q = deque()
        q.append(root)

        def search(node, cur):
            nonlocal depth
            if not node:
                return
            
            if cur > depth:
                depth = cur

            search(node.left, cur + 1)

            search(node.right, cur + 1)
        
        search(root, 1)

        return depth
        