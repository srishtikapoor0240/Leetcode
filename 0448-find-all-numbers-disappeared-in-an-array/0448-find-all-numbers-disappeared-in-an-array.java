import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set <Integer> s= new HashSet<>();
        for(int x:nums)
            s.add(x);
        int i=1;
        List<Integer> arr=new ArrayList<>();
        int c=0;
        while(i<=nums.length)
        {
            if(!s.contains(i))
                arr.add(i);
            i++;
        }
        
        return arr;
    }
}