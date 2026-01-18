class Solution {
    public int balancedStringSplit(String s) {
        String str="";
        int c=0;
        int bal=0;
        for(int i=0;i<s.length();i++)
        {
            int ch=s.charAt(i);
            if(ch=='R')
            {
                bal++;
            }   
            else{
                bal--;
            }
            if(bal==0)
                c++;
        }
        return c;
    }
}