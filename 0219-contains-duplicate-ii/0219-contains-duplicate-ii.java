class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0;
        int j=0;;
        Set<Integer> h=new HashSet<>();
        for(i=0;i<nums.length;i++)
        {
            if(h.contains(nums[i]))
                return true;

            h.add(nums[i]);
            if(i-j>=k)
            {
                h.remove(nums[j]);
                j++;
            }
        }
        return false;
    }
}