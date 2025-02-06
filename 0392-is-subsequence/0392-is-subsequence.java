class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIdx = 0;
        if (s.length() == 0) {
            return true;
        }
        for (int i = 0; i < t.length(); i++){
            if (s.charAt(sIdx) == t.charAt(i)){
                sIdx++;
                if (sIdx > s.length()-1){
                    return true;
                }
            }
        }
        return false;
    }
}