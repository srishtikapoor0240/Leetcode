class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l=new ArrayList<>();
        int rows=matrix.length-1;
        int columns=matrix[0].length-1;
        int m=0,n=0;
        while(m<=rows && n<=columns)
        {
            for(int i=n;i<=columns;i++)
            {
                l.add(matrix[m][i]);
            }
            m++;
            for(int i=m;i<=rows;i++)
            {
                l.add(matrix[i][columns]);

            }   
            columns--;
            if(m<=rows)
            {
                for(int i=columns;i>=n;i--)
                {
                    l.add(matrix[rows][i]);
                }
                rows--;
            }
            if(n<=columns)
            {
                for(int i=rows;i>=m;i--)
                {
                    l.add(matrix[i][n]);
                }
                n++;
            }
        }
        
        
        return l;
    }
}