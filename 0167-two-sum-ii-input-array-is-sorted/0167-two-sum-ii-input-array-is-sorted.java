class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map <Integer,Integer> m=new HashMap<>();
        int arr[]=new int [2];
        for(int i=0;i<numbers.length;i++)
        {
            int diff=target-numbers[i];
            if(m.containsKey(diff))
            {
                
                arr[0]=m.get(diff)+1;
                arr[1]=i+1;
                return arr;
            }

            m.put(numbers[i],i);
        }
        return arr;
    }
}