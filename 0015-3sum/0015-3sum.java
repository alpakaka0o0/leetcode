class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        Arrays.sort(nums); 

        List<List<Integer>> answer = new ArrayList<>();

        while (start < end) {
            int doubleSum = nums[start] + nums[end];
            // 언제 start end 를 줄이고 늘리지?
            int closeZeroIdx = start+1;
            for (int i = start + 1; i < end; i++){
                if (doubleSum + nums[i] == 0){
                    List<Integer> tripleSum = Arrays.asList(nums[start], nums[i], nums[end]);
                    if (!answer.contains(tripleSum)) {
                        answer.add(tripleSum);
                    }
                    closeZeroIdx = i;
                    break;
                }
                if (Math.abs(doubleSum + nums[i]) <Math.abs(doubleSum + nums[closeZeroIdx])){
                    closeZeroIdx = i;
                }
            }
            if (doubleSum + nums[closeZeroIdx] < 0) {
                start++;
            }else{
                end--;
            }
        }
        return answer;
    }
}