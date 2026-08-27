/*class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<=nums.length;i++)
            sum+=i;
        int miss=0;
        for(int i=0;i<nums.length;i++){
            miss+=nums[i];
        }
        return sum-miss;
    }
}*/
class Solution {
    public int missingNumber(int[] nums) {
        int xor=nums.length;
        for(int i=0;i<nums.length;i++){
            xor=xor^i;
            xor=xor^nums[i];
        }
        return xor;
    }
}