# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:

        q = deque()
        q.append(root)
        comp = []

        while q:
            node = q.pop()
            comp.append(node.val)

            if node.left:
                q.append(node.left)
            if node.right:
                q.append(node.right)
            
        comp = sorted(comp)
        return comp[k - 1]

        