class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String arr[]=s.split("\\s+");
        StringBuilder st=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            st.append(arr[i].trim());
            if(i!=0)
                st.append(" ");
        }
        return st.toString();
    }
}

/*lass Solution {
    public String reverseWords(String s) {

        s=s.trim();
        Strinh arr= s.split(" ");
        StringBuilder st= new StringBuilder();
        for(int i=s.length()-1;i>=0;i++){
            if(s.charAt(i)==" "){
                st.append()
            }
        }
    }
}*/