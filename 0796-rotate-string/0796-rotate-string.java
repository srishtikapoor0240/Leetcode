class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal))
            return true;
        if(s.length()!=goal.length())
            return false;
        
        
        for(int i=0;i<s.length();i++)
        {
            String str="";
            char ch=s.charAt(s.length()-1);
            str+=ch;
            str+=s.substring(0,s.length()-1);
            if(str.equals(goal))
            {
                return true;
            }
            else
            {
                s=str;

            }
        }
        return false;
    }
}