class Solution {
    public String reverseParentheses(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c == ')') {
                int start = stack.length() - 1;

                while (stack.charAt(start) != '(') {
                    start--;
                }

                String part = stack.substring(start + 1);
                stack.delete(start, stack.length());

                stack.append(new StringBuilder(part).reverse());
            } 
            else {
                stack.append(c);
            }
        }

        return stack.toString();
    }
}