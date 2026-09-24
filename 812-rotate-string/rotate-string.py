class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        if goal in s+s and len(goal)==len(s):
            return True
        else:
            return False
        