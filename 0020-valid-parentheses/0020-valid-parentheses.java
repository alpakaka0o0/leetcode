class Solution {
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();
        boolean check = true;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ')'){
                if (parentheses.size() == 0 || parentheses.pop() != '('){
                    check = false;
                    break;
                }
            }else if (s.charAt(i) == '}') {
                if (parentheses.size() == 0 ||parentheses.pop() != '{'){
                    check = false;
                    break;
                }
            } else if (s.charAt(i) == ']' ){
                if (parentheses.size() == 0 ||parentheses.pop() != '['){
                    check = false;
                    break;
                }
            }else{
                parentheses.push(s.charAt(i));
            }
        }
        if (parentheses.size() > 0){
            check = false;
        }
        return check;
    }
}