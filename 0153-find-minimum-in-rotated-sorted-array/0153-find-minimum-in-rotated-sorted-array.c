/*int findMin(int* nums, int numsSize) {
    for (int i=1;i<numsSize;i++){
        if(nums[i]<nums[i-1])   
            return nums[i];
    }
    return nums[0];
}*/
int findMin(int* nums, int numsSize) {
    int l=0;
    int h=numsSize-1;
    while(l<h){
        int mid =l+(h-l)/2;
        if(nums[mid]>nums[h])
            l=mid+1;
        else 
            h=mid;

    }
    return nums[l];
}
