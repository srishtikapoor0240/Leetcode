class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            List<Integer> rows=new ArrayList<>();
            rows.add(1);
            for(int j=1; j<i-1; j++)
            {
                int val=l.get(i-2).get(j-1)+l.get(i-2).get(j);
                rows.add(val);
                
            }
            if(i>1)
                rows.add(1);
            l.add(rows);
        }
        return l;
    }
}