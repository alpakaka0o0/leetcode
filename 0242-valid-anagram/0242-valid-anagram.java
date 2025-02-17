class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> anagram = new HashMap<>();

        for (char sChar : s.toCharArray()){
            anagram.put(sChar, anagram.getOrDefault(sChar, 0) + 1);
        }
        for (char tChar : t.toCharArray()){
            if (!anagram.containsKey(tChar)) {
                return false;
            }else if (anagram.get(tChar) < 1){
                return false;
            }else{
                anagram.put(tChar, anagram.get(tChar) - 1);
            }
        }
        return true;
    }
}