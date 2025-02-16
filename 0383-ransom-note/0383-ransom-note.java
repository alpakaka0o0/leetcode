class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            magazineMap.put(ch, magazineMap.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(!magazineMap.containsKey(ch)){
                return false;
            }
            int magazineCount = magazineMap.get(ch);
            if (magazineCount<1){
                return false;
            }
            magazineMap.replace(ch, magazineCount-1);
        }
        return true;
    }
}