class Solution {
    public boolean isVowel(String s)
    {
        int len=s.length();
        if ((s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u') &&
    (s.charAt(len - 1) == 'a' || s.charAt(len - 1) == 'e' || s.charAt(len - 1) == 'i' || s.charAt(len - 1) == 'o' || s.charAt(len - 1) == 'u'))
               return true;
        return false;
    }
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++)
        {
            if(isVowel(words[i]))
             count++;
        }
        return count;
    }
}