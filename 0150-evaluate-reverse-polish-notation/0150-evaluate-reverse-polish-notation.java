class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for (String s : tokens) {
            switch (s) {
                case "+":
                    int a = Integer.valueOf(st.pop());
                    int b = Integer.valueOf(st.pop());
                    st.push(String.valueOf(b + a));
                    break;
                case "-":
                    a = Integer.valueOf(st.pop());
                    b = Integer.valueOf(st.pop());
                    st.push(String.valueOf(b - a));
                    break;
                case "*":
                    a = Integer.valueOf(st.pop());
                    b = Integer.valueOf(st.pop());
                    st.push(String.valueOf(b * a));
                    break;
                case "/":
                    a = Integer.valueOf(st.pop());
                    b = Integer.valueOf(st.pop());
                    st.push(String.valueOf(b / a));
                    break;
                default:
                    st.push(String.valueOf(s));
                    break;
            }
        }
        return Integer.valueOf(st.pop());
    }
}