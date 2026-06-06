//BRUTE FORCE 
/*class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int c=0;
        
        int n = matrix.length;
        int m=matrix[0].length;
        int[] arr=new int[n*m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[c]=matrix[i][j];
                c++;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}*/

//OPTIMAL SOL=> BINARY SERACH ON THE VALUES NOT THE INDICES
class Solution {
    public int count(int mid,int matrix[][]){
        int n=matrix.length;
        int r=0;
        int c=n-1;
        int count=0;
        while (r<n && c>=0){
            if(mid>=matrix[r][c]){
                count+=c+1;
                r++;
            }
            else{
                c--;
            }
        }
        return count;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int m=matrix[0].length;

        int l=matrix[0][0];
        int h=matrix[n-1][m-1];

        while(l<=h){
            int mid=(l+h)/2;
            if(count(mid,matrix)<k){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
            
        }
        return l;
    }
}