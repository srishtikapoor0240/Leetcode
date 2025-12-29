class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> l=new ArrayList<>();
        int min=Math.abs(arr[1]-arr[0]);
        
        for(int i=1;i<arr.length-1;i++)
        {        
            min= Math.min(min,Math.abs(arr[i+1]-arr[i]));
    
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(Math.abs(arr[i+1]-arr[i])==min)
            {
                l.add(new ArrayList<>(Arrays.asList(arr[i],arr[i+1])));
            }
        }
        return l;
    }
}