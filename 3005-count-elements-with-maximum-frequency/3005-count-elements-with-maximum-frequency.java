class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }

        }
        int c=0;
        int n=0;
        for(int i:nums)
        {
            if(map.get(i)>=max){
                max=map.get(i);
                
            }
        }
        for(int i:map.keySet())
        {
            
            if(map.get(i)==max){
                n++;     
            }
        }
        c=max*n;
        return c;
    }
}