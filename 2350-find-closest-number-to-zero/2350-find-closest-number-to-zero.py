class Solution(object):
    def findClosestNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        a=min(nums,key=abs)
        return abs(a) if abs(a) in nums else a
        # mini,diff=100000,0
        # for n in nums:
        #     diff=abs(n-0)
        #     if diff==mini:
        #         if n>0:
        #             mini=n
        #         else:
        #             mini=-1*n
        #     mini=min(mini,diff)
        # return mini
        # mini=100000
        # for n in nums:
        #     diff=abs(n-0)
        #     if diff<mini:
        #         mini=min(diff,mini)
        #         number=n
        #     elif diff==mini:
        #         mini= n if n>number else number
        # return mini