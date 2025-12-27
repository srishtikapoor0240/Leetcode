class Solution {
    public int longestMountain(int[] arr) {
        int peak=1;
        int max_c=0;
        int c=0;
        while(peak<arr.length-1)
        {
            if(arr[peak-1]<arr[peak]&& arr[peak+1]<arr[peak])
            {   
                c=1;
                int i=peak;
                int j=peak;
                while(i>0 && arr[i-1]<arr[i] )
                {
                    c++;
                    i--;
                }    
                while(j<arr.length-1 &&   arr[j+1]<arr[j] )
                {
                    c++;
                    j++;
                }
                max_c=Math.max(max_c,c);
                peak=j;
            }
            else 
            {
                peak++;
            }
            
        }
        return max_c;
    }
}