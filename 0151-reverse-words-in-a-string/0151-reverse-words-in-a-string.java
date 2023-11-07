class Solution {
    public String reverseWords(String s) {
        String ans="";
        String[] c=s.trim().split("\\s+");
        Stack<String> st=new Stack<String>();
        for(int i=0;i<c.length;i++)
        {
            st.push(c[i]);
            System.out.println(c[i]);
        }
        for(int i=0;i<c.length-1;i++)
        {
              ans+=st.pop()+" ";  
        }
        return ans+st.pop();
    }
}