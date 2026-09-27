class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            if(!map.containsKey(n)) map.put(n,0);
            int incr = map.get(n) + 1;
            map.put(n, incr);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for(Map.Entry<Integer, Integer> en : map.entrySet()) {
            int occ = en.getValue();
            int key = en.getKey();
            if(bucket[occ] == null) bucket[occ] = new ArrayList<>();
            bucket[occ].add(key); 
        }

        int idx = 0;
        int[] result = new int[k];
        for(int i = bucket.length - 1; i >= 0 && idx < k; i--) {
            if(bucket[i] != null) {
                for(int n : bucket[i]) {
                    result[idx] = n;
                    idx = idx + 1;
                    if (idx == k) break;
                }
            }
        }

        return result;
    }
}
