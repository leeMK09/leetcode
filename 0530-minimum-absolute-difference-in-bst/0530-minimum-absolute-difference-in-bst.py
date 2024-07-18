# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def getMinimumDifference(self, root: Optional[TreeNode]) -> int:
        diff = None

        q = deque()
        q.append(root)

        comp = []

        while q:
            node = q.pop()

            for i in range(len(comp)):
                val = comp[i]
                diff_val = abs(val - node.val)

                if diff is None:
                    diff = diff_val
                elif diff > diff_val:
                    diff = diff_val
            comp.append(node.val)

            if node.left:
                q.append(node.left)
            if node.right:
                q.append(node.right)

        return diff

