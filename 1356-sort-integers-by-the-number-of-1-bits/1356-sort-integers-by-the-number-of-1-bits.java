class Solution {
    public int[] sortByBits(int[] arr) {
       for(int i=0;i<arr.length;i++)
       {
        for(int j=0;j<arr.length-1;j++){

            int a=arr[j];
            int b=arr[j+1];

            int bitsA= Integer.bitCount(a);
            int bitsB=Integer.bitCount(b);

            if(bitsA>bitsB || (bitsA==bitsB&& a>b)){

                arr[j]=b;
                arr[j+1]=a;

            }
        }
       }
       return arr;
    }
}