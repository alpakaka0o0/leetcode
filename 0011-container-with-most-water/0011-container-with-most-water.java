class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int answer= 0;
        while (start < end){
            int water = 0;
            if (height[start] < height[end]){
                water = height[start] * (end-start);
                start++;
            }else{
                water = height[end] * (end-start);
                end--;
            }
            if (water > answer){
                answer = water;
            }
        }
        return answer;
    }
}