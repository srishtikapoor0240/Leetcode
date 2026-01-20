/*class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(nums[i]))
                {
                    h.put(nums[i],h.get(nums[i])+1);
                }
            else{
                h.put(nums[i],1);
            }
        }
        int sum=0;
        for(int i:h.keySet())
        {
            if(h.get(i)==1)
                sum+=i;
        }
        return sum;
    }
}*/

// lesser space time

class Solution {
    public int sumOfUnique(int[] nums) {
       int[] d = new int[101];
        
        
        int t = 0;
        for(int n: nums){
            d[n] += 1;
        }
        
        for(int r=1; r<101;  r++){
           if(d[r]==1){
               t += r;
           }
        }
        
        
        return t;
    }
}