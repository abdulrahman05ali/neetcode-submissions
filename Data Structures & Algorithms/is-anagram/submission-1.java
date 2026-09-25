class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> occurence = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(occurence.containsKey(c)) {
                int addition = occurence.get(c) + 1;
                occurence.put(c, addition);
            } else {
                occurence.put(c, 1);
            }
        }

        Map<Character, Integer> occurence1 = new HashMap<>();
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(occurence1.containsKey(c)) {
                int addition = occurence1.get(c) + 1;
                occurence1.put(c, addition);
            } else {
                occurence1.put(c, 1);
            }
        }

        return occurence1.equals(occurence);

    }
}
