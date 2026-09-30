class Solution:
    def isValid(self, s: str) -> bool:
        pairs={'}':'{',')':'(',']':'['}
        stack=[]
        for c in s:
            if c in pairs.values():
                stack.append(c)
            elif c in pairs:
                if not stack or stack[-1]!=pairs[c]:
                    return False
                stack.pop()
        if stack == []:
            return True
        else:
            return False
        