class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set=new HashSet<>();
        for(int i:candyType){
            set.add(i);
        }
        int n=candyType.length;
        int diff=set.size();
        if(n/2 < diff){
            return n/2;
        }
        return diff;
    }
}