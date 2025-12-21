import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int x:nums)
            sum+=x;
        int N=0;
        for(int i=0;i<=nums.length;i++)
            N+=i;
        return N-sum;
    }
}