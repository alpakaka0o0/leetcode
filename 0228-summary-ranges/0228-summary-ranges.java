class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        if (nums.length == 0) return answer;


        int prev = nums[0];
        for (int i = 0; i < nums.length-1; i++){
            if(nums[i+1] - nums[i] != 1){
                if (nums[i] == prev){
                    answer.add(Integer.toString(nums[i]));
                }else{
                    answer.add(prev + "->"+nums[i]);
                }
                prev = nums[i+1];
            }
        }
        if (nums[nums.length-1] == prev){
            answer.add(Integer.toString(nums[nums.length-1]));
        }else{
            answer.add(prev + "->"+nums[nums.length-1]);
        }
        return answer;
    }
}