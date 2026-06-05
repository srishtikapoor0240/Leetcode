class Solution {
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
}