class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(String word: words)
        {
            if(isAllowed(allowed,word))
                c++;
        }
        return c;
    }
    private boolean isAllowed(String allowed, String word)
    {
        for(int i=0;i<word.length();i++)
        {
            if(allowed.indexOf(word.charAt(i))==-1)
                return false;
        }
        return true;
    }
}