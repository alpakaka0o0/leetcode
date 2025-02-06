class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int[] answer = new int[2];
        while (start < end) {
            if (numbers[start]+numbers[end] == target){
                answer[0] = start+1;
                answer[1] = end+1;
                break;
            }else if (numbers[start]+numbers[end] > target){ // 큰 경우
                end--;
            }else{ // 작은경우 
                start++;
            }
        }
        return answer;
    }
}