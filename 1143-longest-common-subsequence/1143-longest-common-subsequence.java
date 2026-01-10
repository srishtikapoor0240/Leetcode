class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m= text1.length();
        int n=text2.length();
        int c[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++)
            c[i][0]=0;
        for(int i=0;i<=n;i++)
            c[0][i]=0;
        char b[][]=new char[m+1][n+1];

        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    c[i][j]=c[i-1][j-1]+1;
                    b[i][j]='D';
                }
                else if (c[i-1][j]>=c[i][j-1])
                {
                    c[i][j]=c[i-1][j];
                    b[i][j]='U';
                }
                else 
                {
                    c[i][j]=c[i][j-1];
                    b[i][j]='L';
                }
            }
        }
        return c[m][n];
    }
}