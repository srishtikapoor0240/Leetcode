class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];     
        for(int i=0;i<nums1.length;i++){
            int c=0;
            boolean flag=false;
            while(c<nums2.length && nums1[i]!=nums2[c]){
                c++;
            }
            while(c<nums2.length){
                if(nums2[c]>nums1[i]){
                    ans[i]=nums2[c];
                    flag=true;
                    break;
                }
                c++;
            }
            if(flag==false){
                ans[i]=-1;
            }
            
        }
        return ans;
    }
}