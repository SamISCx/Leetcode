class Solution:
    def partition(self, s: str) -> list[list[str]]:
        result=[]
        def dfs(start,path):
            if start==len(s):
                result.append(path[:])
                return
            for i in range(start,len(s)):
                if is_palindrome(s,start,i):
                    path.append(s[start:i+1])
                    dfs(i+1,path)
                    path.pop()
        def is_palindrome(string,left,right):
            while left<right:
                if string[left]!=string[right]:
                    return False
                left+=1
                right-=1
            return True
        dfs(0,[])
        return result

        