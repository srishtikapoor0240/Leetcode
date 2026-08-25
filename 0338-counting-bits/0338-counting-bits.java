/*class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<ans.length;i++){
            int c=0;
            int x=i;
            while(x!=0){
                int s=x&1;
                if (s==1)
                    c++;
                x=x>>1;
            }
            ans[i]=c;
        }
        return ans;
    }   
}*/
class Solution {
    public int[] countBits(int n) {

        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }

        return ans;
    }
}