# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        values = []
        depth_ctx = 0

        def search(root, depth, isLeft):
            nonlocal values
            nonlocal depth_ctx
            if not root: 
                return

            if isLeft == True and depth_ctx < depth:
                values.append(root.val)
            elif depth_ctx < depth: 
                values.append(root.val)
            
            if depth_ctx < depth:
                depth_ctx = depth

            search(root.right, depth + 1, False)

            search(root.left, depth + 1, True)
        
        search(root, 1, False)
        
        return values
        