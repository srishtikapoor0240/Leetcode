class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String str=s1+" "+s2;
        List<String>unique= new ArrayList<>();
        String words[]=str.split(" ");
        for(int i=0;i<words.length;i++)
        {
            int c=0;
            for(int j=0;j<words.length;j++)
            {
                if(words[i].equals(words[j]))
                    c++;
            }
            if(c==1)
                unique.add(words[i]);

        }
        return unique.toArray(new String[0]);
    }
}