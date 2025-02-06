class Solution {
    public boolean isPalindrome(String s) {
        boolean result = true;
        s= s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int end = s.length()-1;
        int start = 0;
        while (end > start) {
            if (s.charAt(end) != s.charAt(start)){
                result = false;
                break;
            }
            end--;
            start++;
        }
        return result;
    }
}