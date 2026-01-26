class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int max=0;
        String b="";
        for(int i=0;i<s.length();i++)
        {
            if(b.indexOf(s.charAt(i))==-1)
            {
                b+=s.charAt(i);
                end++;
                max=Math.max(max,b.length());
            }
            else
            {
                while(b.indexOf(s.charAt(i))!=-1){
                    start++;
                    b=b.substring(1);
                }
                 b+=s.charAt(i);
                 end++;
                 
            }

        }
        return max;
    }
}