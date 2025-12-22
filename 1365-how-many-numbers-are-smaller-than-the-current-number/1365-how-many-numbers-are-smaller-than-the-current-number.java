import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[]=new int[nums.length];
        int temp[]=new int[nums.length];
        int k=0;
        for(int x: nums)
            temp[k++]=x;
        Arrays.sort(temp);

        Map <Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!m.containsKey(temp[i]))
                m.put(temp[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=m.get(nums[i]);
        }
        
        return arr;
    }

}