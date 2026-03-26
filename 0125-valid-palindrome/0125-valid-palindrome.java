class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("\\s","");
        s=s.replaceAll("[^a-zA-Z0-9]","");
        StringBuffer str=new StringBuffer(s);
        if(str.reverse().toString().equals(s))
            return true;
        return false;
    }
}