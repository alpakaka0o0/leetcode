class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        // 개수를 확인
        HashMap<Character, Character> mappingDict = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // 1. key에 있고 값도 같은 경우 pass
            // 2. key에 있는데 value가 다른 경우 || key가 없는데 value는 존재하는 경우 false
            // 3. 둘다 없는 경우 put
            if (mappingDict.containsKey(sChar) && mappingDict.get(sChar) == tChar){
                continue;
            }else if (!mappingDict.containsKey(sChar) && !mappingDict.containsValue(tChar)){
                mappingDict.put(sChar, tChar);
            }else{
                return false;
            }
        }
        return true;
    }
}