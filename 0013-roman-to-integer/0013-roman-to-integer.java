class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int intNum = 0;
        for (int i = 0; i<s.length()-1; i++){
            if (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i+1))){
                intNum -= romanMap.get(s.charAt(i));
            }else {
                intNum += romanMap.get(s.charAt(i));
            }
        }
        intNum += romanMap.get(s.charAt(s.length() - 1));
        return intNum;

    }
}