class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++){
            String token = tokens[i];
            if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) {
                st.push(caculate(st.pop(), st.pop(), token));
            }else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }

    private int caculate (int num1, int num2, String op){
        switch(op) {
            case "+": return num2 + num1;
            case "-": return num2 - num1;
            case "*": return num2 * num1;
            case "/": return num2 / num1;
            default: throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }
}