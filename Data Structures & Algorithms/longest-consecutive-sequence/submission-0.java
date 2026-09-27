class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }

        for(int n: set) {
            if(!set.contains(n-1)) {
                int count = 0;
                while(set.contains(n + count)) {
                    count++;
                    longest = Math.max(longest, count);
                }
            }
        }

        return longest;
    }
}
