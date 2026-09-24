class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> store = new HashSet<>();
        for(int n : nums) {
            if(store.add(n) == false) return true;
        }
        return false;
    }
}