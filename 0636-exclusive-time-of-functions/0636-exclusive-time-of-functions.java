class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        
        int []ans=new int[n];
        Stack<Integer> st=new Stack<>();
        int prev=0;
        for(String l:logs){
            String div[]=l.split(":");
            int id=Integer.parseInt(div[0]);
            String type=div[1];
            int time=Integer.parseInt(div[2]);
            if(type.equals("start")){
                if(!st.isEmpty())
                     ans[st.peek()]+=time-prev;
                st.push(id);
                prev=time;

            }
            else {
                
                ans[st.peek()]+=time-prev+1;
                st.pop();
                prev=time+1;
            }

        }
        return ans;

    }
}