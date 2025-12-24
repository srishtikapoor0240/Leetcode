import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int k=nums.length-1;
        int arr[]=new int[nums.length];
        while(l<=r)
        {
            int left=Math.abs(nums[l]);
            int right=Math.abs(nums[r]);

            if(left>right)
            {
                arr[k--]=left*left;
                l++;
            }
            else
            {
                arr[k--]=right*right;
                r--;
            }
        }
        return arr;
    }
}