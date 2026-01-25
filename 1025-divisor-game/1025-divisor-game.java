/*class Solution {
    public boolean divisorGame(int n) {
        int c=1;
        while(n>1){
        for(int i=1;i<n;i++)
        {
            if(n%i==0) { 
                n=n-i;
                c++;
                break;
            }
        }
        }
        return c%2==0;
    }
}*/

class Solution{
    public boolean divisorGame(int n){
        return n%2==0;
    }
}