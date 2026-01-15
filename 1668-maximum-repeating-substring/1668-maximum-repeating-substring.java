class Solution {
    public int maxRepeating(String sequence, String word) {
        int c=0;
        if(sequence.indexOf(word)==-1)
            return 0;
        if(sequence.indexOf(word)==sequence.lastIndexOf(word))
            return 1;
        String r=word;
        while(sequence.contains(r))
        {
            c++;
            r+=word;
        }
        return c;
    }
}