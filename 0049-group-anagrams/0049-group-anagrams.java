class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> group = new HashMap<>();

        for (String candidate : strs) {
            char[] charArray = candidate.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray); 

            group.putIfAbsent(key, new ArrayList<>());
            group.get(key).add(candidate);
        }

        return new ArrayList<>(group.values());
    }
}