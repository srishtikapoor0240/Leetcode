class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String [] divide=path.split("/");
        String ans="";
        for(String s:divide){
            if(s.equals("")){
                continue;
            }
            else if(s.equals(".")){
                continue;
            }
            else if(s.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(s);
            }
        }
        if(st.isEmpty()){
            return "/";
        }
        for(String p:st){
            ans+="/"+p;
        }
        return ans;
    }
}