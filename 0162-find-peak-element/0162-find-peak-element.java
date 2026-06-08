/*class Solution {
    public int findPeakElement(int[] nums) {
        int curr=nums[0];
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=curr){
                curr=nums[i];
                index=i;
            }
        }
        return index;
    }
}*/
class Solution {
    public int findPeakElement(int[] nums) {
        int lo=0;
        int hi=nums.length-2;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]<nums[mid+1])
            {
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return lo;
    }

}