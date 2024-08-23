class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        new_string=""
        for i in range(0,min(len(word1),len(word2))):
                new_string+=word1[i]+word2[i]
        if len(word1)>min(len(word1),len(word2)):
            new_string+=word1[min(len(word1),len(word2)):len(word1)]
        if len(word2)>min(len(word1),len(word2)):
            new_string+=word2[min(len(word1),len(word2)):len(word2)]
        return new_string