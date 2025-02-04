class Solution {
    public String reverseWords(String s) {
        String[] sList = s.trim().split(" ");
        String answer = "";

        for (int i = sList.length-1; i >= 0; i--){
            if (sList[i].equals(" ") || sList[i].equals("")){
                continue;
            }
            answer += sList[i] + " ";
        }

        return answer.trim();
    }
}