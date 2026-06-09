/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
/*class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        for(int i=0;i<mountainArr.length();i++){
            if(mountainArr.get(i)==target)
                return i;
        }
        return -1;
    }
}*/

class Solution{
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int lo=0;
        int hi=mountainArr.length()-1;

        while(lo<hi){
            int mid =lo+(hi-lo)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1))
                hi=mid;
            else 
                lo=mid+1;
            
        }
        int peak=lo;

        //left search
        lo=0;
        hi=peak;
        while(lo<=hi){
            int mid =lo+(hi-lo)/2;
            if(mountainArr.get(mid)==target)
                return mid;
            else if(mountainArr.get(mid)<target)
                lo=mid+1;
            else 
                hi=mid-1;
            
        }
        //right search it is decreasring so reverse lo= and hi in the conditions
        lo=peak+1;
        hi=mountainArr.length()-1;
        while(lo<=hi){
            int mid =lo+(hi-lo)/2;
            if(mountainArr.get(mid)==target)
                return mid;
            else if(mountainArr.get(mid)>target)
                lo=mid+1;
            else 
                hi=mid-11;
            
        }
        return -1;

    }
}