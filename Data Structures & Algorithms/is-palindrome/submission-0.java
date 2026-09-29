class Solution {
    public boolean isPalindrome(String s) {
        Set<Character> a = new HashSet<>(List.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','r','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'));

        s = s.toLowerCase();
        String word = "";
        for(int i = 0; i < s.length(); i++) {
            if(a.contains(s.charAt(i))) word+=s.charAt(i);
        }
        int left = 0;
        int right = word.length() - 1;
        while(right > left) {
            if(word.charAt(left) != word.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
}
