class Solution {
    
    public int count(boolean []used,int n,int i){
        if(i>n){
            return 1;

        }
        int ans=0;
        for(int j=1;j<=n;j++){
            if(!used[j] && (i%j==0 || j%i==0)){
                used[j]=true;
                ans+=count(used,n,i+1);
                used[j]=false;
            }
        }
        return ans;
    }
    public int countArrangement(int n) {
        boolean used[]=new boolean[n+1];
        return count(used,n,1);
        
        
    }
}