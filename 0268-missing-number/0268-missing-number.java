class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int max=nums.length;
        int total=0;
        for(int i=0;i<=max;i++){
            total+=i;
        }
        return total-sum;
    }
}