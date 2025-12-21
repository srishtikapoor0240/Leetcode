class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int c=0;
        if(s.indexOf(' ')==-1)
        {
            return s.length();
        }
        for(int i=s.length()-1;s.charAt(i)!=' ';i--)
        {
            c++;
        }
        
        return c;
    }
}