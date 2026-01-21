class Solution {
    public boolean divideArray(int[] nums) {
        HashMap <Integer,Integer> map =new HashMap<>();
        for(int i:nums)
        {
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        
        }
        int pairs=nums.length/2;
        int c=0;
        for(int i: map.keySet())
        {
            if(!(map.get(i)%2==0))
            {
                return false;
            }
        }
        return true;
    }
}