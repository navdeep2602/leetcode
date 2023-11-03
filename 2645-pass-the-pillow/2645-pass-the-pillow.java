import java.lang.Math;
class Solution {
    public int passThePillow(int n, int time) {
        int ans;
        int y=(int)Math.ceil(time/(n-1));
        int z=time%(n-1);
        if(z==0)
          {
              if(y%2==1)
                  ans=n;
                else
                  ans=1;
          }
        else
        {
            if(y%2==0)
             ans=1+z;
            else
              ans=n-z;
        } 
        return ans; 
    }
}