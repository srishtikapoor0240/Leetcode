/*class Solution {
    public int reverseBits(int n) {
        String s =Integer.toBinaryString(n);
        while(s.length()<32){
            s="0"+s;
        }
       String rev=new StringBuilder(s).reverse().toString();
        
        long r=Long.parseLong(rev,2);
        return (int)r;
    }
}*/
class Solution {
    public int reverseBits(int n) {
        int ans=0;
        for(int i=0;i<32;i++){
            ans=(ans<<1)| (n&1);
            n=n/2;
        }
        return ans;
    }
}