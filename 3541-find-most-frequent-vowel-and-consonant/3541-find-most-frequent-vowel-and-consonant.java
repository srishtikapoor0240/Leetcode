class Solution {
    public int maxFreqSum(String s) 
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int maxV=0;
        int maxC=0;
        for(char key:map.keySet()){
            if((key=='a' ||key=='e'||key=='i'||key=='o'||key=='u')){
                maxV=Math.max(map.get(key),maxV);
            }
            else{
                
                    maxC=Math.max(map.get(key),maxC);
                
            }
        }
        return maxC+maxV;
    }
}