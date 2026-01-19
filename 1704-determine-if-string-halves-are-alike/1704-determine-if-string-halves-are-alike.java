/*class Solution {
    public boolean halvesAreAlike(String s) {
        int l=s.length()/2;
        s=s.toLowerCase();
        int c=0;
        int b=0;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                c++;
            }
        }
        for(int i=l;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                b++;
            }
        }
        if(c==b)
            return true;
        return false;
    }
}*/

// code 

class Solution{
    public boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u';
    }

    public boolean halvesAreAlike(String s)
    {
        s=s.toLowerCase();
        int n=s.length();
        int c=0;
        for(int i=0;i<n/2;i++)
        {
            if(isVowel(s.charAt(i)))
                c++;
            if(isVowel(s.charAt(i+n/2)))
                c--;
        }
        if(c==0)
            return true;
        return false;
    }
}