class Solution {
    public int minLength(String s) {
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) stack.push(s.charAt(i));
            else if (s.charAt(i)=='B' && stack.peek()=='A') {
                stack.removeLast();
            }
            else if (s.charAt(i)=='D' && stack.peek()=='C'){
                stack.removeLast();
            }
            else stack.push(s.charAt(i));
        }
        return stack.size();
    }
}