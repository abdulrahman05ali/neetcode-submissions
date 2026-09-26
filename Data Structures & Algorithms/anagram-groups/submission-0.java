class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for(String word : strs) {
            String key = makeKey(word);
            if(!groups.containsKey(key)) {
                groups.put(key, new ArrayList<>());
            } 
            groups.get(key).add(word);
        }
        List<List<String>> result = new ArrayList<>(groups.values());
        return result;
    }

    private String makeKey(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        String sorted = new String(charArray);

        return sorted;
    }
}
