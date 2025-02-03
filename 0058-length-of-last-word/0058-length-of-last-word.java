class Solution {
    public int lengthOfLastWord(String s) {
        String[] sList = s.trim().split(" ");
        return sList[sList.length-1].length();
    }
}