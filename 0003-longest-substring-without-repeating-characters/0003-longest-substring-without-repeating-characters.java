class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>map=new HashMap<>();
        int max=0;
        int c=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                left=Math.max(left,map.get(s.charAt(i))+1);

            }
            map.put(s.charAt(i),i);
                c=i-left+1;
            max=Math.max(c,max);
        }
        return max;
    }
}