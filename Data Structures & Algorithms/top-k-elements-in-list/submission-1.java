class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int n : nums) {
            if(!count.containsKey(n)) count.put(n , 0);
            int increment = count.get(n) + 1;
            count.put(n, increment);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for(Map.Entry<Integer, Integer> en : count.entrySet()) {
            int c = en.getValue();
            if (bucket[c] == null) bucket[c] = new ArrayList<>();
            bucket[c].add(en.getKey());
        }

        int idx=0;
        int[] result = new int[k];
        for(int i = bucket.length - 1; i >= 0; i--) {
            if(bucket[i] != null ) {
                for(int n : bucket[i]) {
                    if(idx == k) break;
                    result[idx] = n;
                    idx++;
                }
            }
        }

        return result;
    }
}
