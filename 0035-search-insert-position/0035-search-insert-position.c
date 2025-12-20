int searchInsert(int* nums, int numsSize, int target) {
    int l=0;
    int h=numsSize-1;
    int mid;
    while(l<=h)
    {
        mid=(l+h)/2;
        if(nums[mid]==target)
            return mid;
        else if(target<nums[mid])
            h=mid-1;
        else 
            l=mid+1;
    }
    if(target<nums[0])
        return 0;
    if(target<nums[mid])
        return mid;
    else
        return mid+1;
}