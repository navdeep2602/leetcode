class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        i=0
        count=0
        if s=="":
            return True
        for char in t:
            if i<len(s) and char==s[i]:
                i+=1
                count+=1

        if count==len(s):
            return True
        return False