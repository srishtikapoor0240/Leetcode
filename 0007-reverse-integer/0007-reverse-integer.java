class Solution {
    public int reverse(int x) {
        try{int i=0;
        if(x>=0)
        {
            String s=Integer.toString(x);
            StringBuilder st=new StringBuilder(s);
            String str=st.reverse().toString();
            i=Integer.parseInt(str);
        }
        if(x<0)
        {
            String s=Integer.toString(x);
            StringBuilder st=new StringBuilder(s.substring(1));
            String str="-"+st.reverse().toString();
            i=Integer.parseInt(str);
        }
        return i;
        }
        catch (Exception e){
            return 0;
        }
       
    }
}