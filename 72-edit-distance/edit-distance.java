class Solution {
    public int solve(String s1,String s2,int n,int m,int dp[][])
    {
        if(n<0)
            return m+1;
        if(m<0)
            return n+1;
        if(dp[n][m]!=-1)
            return dp[n][m];
        if(s1.charAt(n)==s2.charAt(m))
        {
            return dp[n][m]=solve(s1,s2,n-1,m-1,dp);
        }
                            //delete                                  //replace
        return dp[n][m]=1+Math.min(solve(s1,s2,n-1,m,dp),Math.min(solve(s1,s2,n-1,m-1,dp),
        solve(s1,s2,n,m-1,dp)));
            //insert
    }
    public int minDistance(String word1, String word2) {
        int n,m;
        n=word1.length();
        m=word2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(word1,word2,n-1,m-1,dp);
    }
}