class Solution {
    public int count(int nums[],int mid){
        int s=0;
        int n=1;
        for(int j:nums){
            if(s+j<=mid){
                s+=j;
            }
            else{
                s=j;
                n++;
            }
        }
        return n;
    }
    public int splitArray(int[] nums, int k) {
        int lo=0;
        int hi=0;

        for(int i=0;i<nums.length;i++){
            lo=Math.max(lo,nums[i]);
            hi+=nums[i];
        }

        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(count(nums,mid)<=k){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return lo;
    }
}