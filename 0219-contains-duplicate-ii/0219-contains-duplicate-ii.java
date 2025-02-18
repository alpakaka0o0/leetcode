class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> numIdx = new HashMap<>();

        for (int i = 0; i<nums.length; i++){
            if (numIdx.containsKey(nums[i])){
                if (i - numIdx.get(nums[i]) <= k){
                    return true;
                }
            }
            numIdx.put(nums[i], i);
        }
        return false;
    }
}