class Solution {
    public int countDays(int[]weights,int mid){
        int s=0;
        int days=1;
        for(int i=0;i<weights.length;i++)
        {
            
            if(s+weights[i]<=mid){
                s+=weights[i];
                
            }
            else{
                days++;
                s=weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int lo=0;
        int hi=0;

        for(int i=0;i<weights.length;i++){
            hi+=weights[i];
            lo=Math.max(lo,weights[i]);
        }
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(countDays(weights,mid)<=days){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return lo;
    }

}