//BRUTE FORCE 
/*class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];     
        for(int i=0;i<nums1.length;i++){
            int c=0;
            boolean flag=false;
            while(c<nums2.length && nums1[i]!=nums2[c]){
                c++;
            }
            while(c<nums2.length){
                if(nums2[c]>nums1[i]){
                    ans[i]=nums2[c];
                    flag=true;
                    break;
                }
                c++;
            }
            if(flag==false){
                ans[i]=-1;
            }
            
        }
        return ans;
    }
}*/

// OPTIMAL USING MONOTONIC STACK
class Solution{
    public int[] nextGreaterElement(int []nums1,int[]nums2){
        Stack <Integer>st=new Stack<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() && nums2[i]>st.peek()){
                map.put(st.pop(),nums2[i]);
            }
            st.push(nums2[i]);
        }
        while(!st.isEmpty()) {
            map.put(st.pop(), -1);
        }

        int[] ans = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}