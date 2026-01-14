class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> str=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            for(int j=0;j<words.length;j++)
            {
                if(j!=i && words[j].contains(s)){
                    str.add(s);
                    break;
                }
            }

        }
        return str;
    }
}