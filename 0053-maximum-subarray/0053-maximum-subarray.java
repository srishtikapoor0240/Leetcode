/*class Solution {
    int sum(int arr[],int low,int high){
        if(low==high)   
            return arr[low];
        int mid=(low+high)/2;

        int left_sum=sum(arr,low,mid);
        int right_sum=sum(arr,mid+1,high);
        int cross_sum=crossing_sum(arr,low,mid,high);

        return Math.max(Math.max(left_sum,right_sum),cross_sum);
        
    }
    int crossing_sum(int arr[],int left,int mid,int high){
        int ls=Integer.MIN_VALUE;
        int sum_left=0;

        for(int i=mid;i>=0;i--){
            sum_left+=arr[i];
            if(sum_left>ls)
                ls=sum_left;

        }
        int rs=Integer.MIN_VALUE;
        int sum_right=0;
        for(int i= mid+1;i<=high;i++)
        {
            sum_right+=arr[i];
            if(sum_right>rs)
                rs=sum_right;
        }
        return ls+rs;
    }
    public int maxSubArray(int[] nums) {
        return sum(nums,0,nums.length-1);
    }
}*/

// TIME LIMIT EXCEEDED 
//SO NO DIVIDE AND CONQUER
//using Kadane’s Algorithm

class Solution{
    public int maxSubArray(int [] nums)
    {
        int maxSoFar=nums[0];
        int currMax=nums[0];

        for(int i=1;i<nums.length;i++){
            currMax=Math.max(nums[i],currMax+nums[i]);
            maxSoFar=Math.max(maxSoFar,currMax);

        }
        return maxSoFar;
    }
}