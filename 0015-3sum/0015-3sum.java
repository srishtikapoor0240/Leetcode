class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int first=0;first<nums.length-2;first++)
        {
            int l=first+1; 
            int r=nums.length-1;
            if(first>0 && nums[first]==nums[first-1])
                continue;
            while(l<r)
            {
                
                if(nums[first]+nums[l]+nums[r]==0)
                {
                     list.add(new ArrayList<>(Arrays.asList(nums[first],nums[l],nums[r])));
                     while(l<r && nums[l]==nums[l+1])
                        l++;
                    while(l<r && nums[r]==nums[r-1])
                        r--;
                    
                    l++;
                    r--;
                }
                else if(nums[first]+nums[l]+nums[r]<0)
                    l++;
                else
                    r--;
            }
        }
        return list;
    }
}