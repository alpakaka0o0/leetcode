class Solution {
    public boolean wordPattern(String pattern, String s) {
        // 개수를 확인
        HashMap<Character, String> mappingDict = new HashMap<>();
        String[] sArray = s.split(" ");
        if (sArray.length != pattern.length()) return false;

        for (int i = 0; i < pattern.length(); i++){
            char patternChar = pattern.charAt(i);
            String sWord = sArray[i];
            if (mappingDict.containsKey(patternChar) && mappingDict.get(patternChar).equals(sWord)){
                continue;
            }else if (!mappingDict.containsKey(patternChar) && !mappingDict.containsValue(sWord)){
                mappingDict.put(patternChar, sWord);
            }else{
                return false;
            }
        }
        return true;
    }
}