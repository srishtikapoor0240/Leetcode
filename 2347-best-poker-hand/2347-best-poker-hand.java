class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Integer,Integer> r=new HashMap<>();
        HashMap<Character,Integer> s=new HashMap<>();

        for(int i:ranks)
        {
            if(r.containsKey(i))
                r.put(i,r.get(i)+1);
            else
                r.put(i,1);
        }
        for(char i:suits)
        {
            if(s.containsKey(i))
                s.put(i,s.get(i)+1);
            else
                s.put(i,1);
        }
        for(char i:suits)
        {
            int n=s.get(i);
            if(n==5)
                return "Flush";
        }
        for(int i:ranks)
        {
            int n=r.get(i);
            if(n>=3)
                return "Three of a Kind";
        }
        for(int i:ranks)
        {
            int n=r.get(i);
            if(n==2)
                return "Pair";
        }
        return "High Card";
        
    }
}