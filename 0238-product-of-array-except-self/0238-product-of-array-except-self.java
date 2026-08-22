class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1;
        int product[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            product[i]=p;
            p*=nums[i];
        }
        p=1;
        for(int i=nums.length-1;i>=0;i--){
            product[i]*=p;
            p*=nums[i];
        }
        return product;
    }
}