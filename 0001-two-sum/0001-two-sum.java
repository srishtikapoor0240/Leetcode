import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> m=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int x=target-nums[i];
            
            if(m.containsKey(x))
            {
                arr[0]=i;
                arr[1]=m.get(x);
                return arr;
            }
            m.put(nums[i],i); 
        }
        return arr;
    }    
}