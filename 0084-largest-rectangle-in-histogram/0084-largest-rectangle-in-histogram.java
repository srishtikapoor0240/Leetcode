/*class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=0;
        int n=heights.length;
        for(int i=0;i<heights.length;i++){
            int h=heights[i];
            int lower=i-1;
            int higher=i+1; 
            while((lower>=0&&heights[lower]>=heights[i])){
                    h+=heights[i];
                    lower--;
            }
            while(higher<n &&heights[higher]>=heights[i]){
                    h+=heights[i];
                    higher++;
            }
            
            max=Math.max(h,max);
        }
        return max;
    }
}*/
class Solution{
    public int largestRectangleArea(int []heights){
        int max=0;
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<heights.length ;i++){
           int h=0;
           int width=0;
            while (!st.isEmpty() && heights[st.peek()]>=heights[i]){
                 h=heights[st.pop()];
                if(st.isEmpty()){
                    width=i;
                }
                else{
                    width=i-st.peek()-1;
                }
                 max=Math.max(h*width,max);
            }
           
            st.push(i);
        }
        while(!st.isEmpty()){
            int h=heights[st.pop()];
            int width;
            if(st.isEmpty()){
                width=heights.length;
            }
            else{
                width=heights.length-st.peek()-1;
            }
            max=Math.max(max,h*width);
        }
        return max;
    }
}