# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        levels = []

        def search(root, depth):
            if not root:
                return
            
            if len(levels) < depth:
                levels.append([])
            print(levels, len(levels), depth)
            levels[depth - 1].append(root.val)
            # levels[depth].append(root.val)

            search(root.left, depth + 1)
            search(root.right, depth + 1)


        search(root, 1)

        print(levels)
        return levels