class Solution {
    public int maxArea(int[] height) {
        int p=0;
        int q=height.length-1;
        //int p=height[l]*height[r];
        int max=0;
        while(p<q){
            int h=Math.min(height[p],height[q]);
            int w=q-p;
            int area=w*h;
            max=Math.max(area,max);
            if(height[p]<height[q]){
                p++;
            }
            else{
                q--;
            }
        }
        return max;
    }
}