class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map=new HashMap<>();

        for(String a: arr)
        {
            if(map.containsKey(a))
            {
                int i=map.get(a);
                map.put(a,i+1);
            }
            else{
                map.put(a,1);
            }
        }
        int c=0;
        for(String a: arr)
        {
            int i=map.get(a);
            if(i==1)
            {
                c++;
            }
            if(c==k)
            {
                return a;
            }
        }
        return "";
    }
}