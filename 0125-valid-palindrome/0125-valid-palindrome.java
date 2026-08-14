class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
                st.append(s.charAt(i));
        }
        String str=st.toString();
        return st.reverse().toString().equals(str);
    }
}