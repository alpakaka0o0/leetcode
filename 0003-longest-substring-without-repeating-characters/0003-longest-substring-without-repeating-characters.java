class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < s.length(); right++){
            String subString = s.substring(left, right);
            System.out.println(subString);
            if (subString.indexOf(s.charAt(right))!=-1){
                while((subString.indexOf(s.charAt(right))!=-1)&&left < right){
                    left++;
                }
            }
            if (maxLen < (right - left + 1 )){
                maxLen = right - left + 1;
            }
        }
        return maxLen;
    }
}