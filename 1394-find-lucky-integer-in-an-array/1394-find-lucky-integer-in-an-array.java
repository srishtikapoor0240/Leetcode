class Solution {
    public int findLucky(int[] arr) {
        
        int max=-1;
        HashMap <Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                int n=hm.get(arr[i]);
                hm.put(arr[i],n+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            int f=hm.get(arr[i]);
            if(arr[i]==f && arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}