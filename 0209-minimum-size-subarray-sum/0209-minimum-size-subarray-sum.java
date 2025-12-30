class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int total =0;
        int min= Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
            
            while(total>=target)
            {
                min=Math.min(min, i-l+1);
                total-=nums[l];
                l++;

            }
        }
        if(min==Integer.MAX_VALUE)
            return 0;
        else
            return min;
    }
}