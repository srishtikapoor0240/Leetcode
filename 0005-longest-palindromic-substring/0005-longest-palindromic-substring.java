/*class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            int n=s.length();
            
            while(i<n){
                StringBuilder st=new StringBuilder(s.substring(i,n));
                String og=st.toString();
                String rev=st.reverse().toString();
                if(og.equals(rev)){
                   if(st.length()>max){
                        max=Math.max(max,st.length());
                        ans=s.substring(i,n);
                   }
                }
                n--;
            }

        }
        return ans;
        

    }
}*/

class Solution {
    public String longestPalindrome(String s) {
        int max=1;
        //String ans="";
        int start=0;
        int n = s.length();
        for(int i=0;i<n;i++){
            int l1=expand(s,i,i);
            int l2=expand(s,i,i+1);

            int len=Math.max(l1,l2);
            if(len>max){
                max=len;
                start=i-(len-1)/2;
            }
        }
        return s.substring(start,start+max);

    }
    public int expand(String s, int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;


        }
        return right-left-1;
    }
}