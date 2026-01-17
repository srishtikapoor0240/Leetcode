class Solution {
    public int findLucky(int[] arr) {
        
        int max=-1;
        for(int i=0;i<arr.length;i++)
        {
            int c=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                    c++;
            }
            if(arr[i]==c && arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}