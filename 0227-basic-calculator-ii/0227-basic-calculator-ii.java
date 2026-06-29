class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        int num=0;
        char sign='+';
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(Character.isDigit(a)){
                num=num*10+(a-'0');
            }
            if((!Character.isDigit(a)&& a!=' ')||i==s.length()-1){
            if(sign=='+'){
                st.push(num);
                
            }
            if(sign=='-'){
                st.push(-num);
            }
            if(sign=='*'){
                st.push(st.pop()*num);
                
            }
            if(sign=='/'){
                st.push(st.pop()/num);
            }
            sign =a;
            num=0;
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}