class Solution:
    def simplifyPath(self, path: str) -> str:
        splited = [x for x in path.split('/') if x]
        parent = ".."
        skip = "."
        result = []
        
        if len(splited) == 0:
            return "/"

        for i in range(len(splited)):
            if splited[i] == skip:
                continue
            if splited[i] == parent:
                if len(result) == 0:
                    continue
                else:
                    result.pop()
            else:
                result.append(splited[i])
        

        return "/" + "/".join(result)