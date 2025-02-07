class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int currentSum = nums[left];
        int minLength = nums.length;
        boolean check = false;
        while(left < nums.length){
            if ((currentSum <= target) && (right < nums.length-1)){
                right++;
                currentSum+=nums[right];
            }else{
                currentSum-= nums[left];
                left++;
            }
            if (currentSum == target){
                check = true;
                if (minLength > (right - left + 1)){
                    minLength = right - left + 1;
                }
            }
        }
        if (!check) {
            return 0;
        }
        return minLength;
    }
}