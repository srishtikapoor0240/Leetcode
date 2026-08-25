class Solution {
    public int getSum(int a, int b) {
        int xor =a^b;
        int c=a&b;
        while(c!=0){
            c=c<<1;
            int sum =xor^c;
            int carry=c&xor;

            xor=sum;
            c=carry;
        }
        return xor;
    }
}