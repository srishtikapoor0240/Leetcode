class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int tot=0;
        for(int i=0;i<pieces.length;i++){
            tot+=pieces[i].length;
        }
        if(tot!=arr.length)
            return false;

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        for(int i=0;i<pieces.length;i++){
            if(pieces[i].length<=1){
                if(!map.containsKey(pieces[i][0]))
                    return false;
            }
            else{
                if(!map.containsKey(pieces[i][0]))
                    return false;
                int k=1;
                int c=map.get(pieces[i][0]);
                while(k<pieces[i].length){
                    
                    if(!map.containsKey(pieces[i][k]) || !(map.get(pieces[i][k])==(c+1))){
                        return false;
                    }
                    c=map.get(pieces[i][k]);
                    k++;
                }
            }
        }
        return true;
    }
}