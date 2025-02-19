class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> answer= new ArrayList<>();
        int start = 0;
        int end = 0;

        for (int i = 0; i<intervals.length; i++){
            if ((end >= intervals[i][0])){
                if (start > intervals[i][0]){
                    start = intervals[i][0];
                }
                if (end < intervals[i][1]){
                    end = intervals[i][1];
                }
            }else{
                answer.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        answer.add(new int[]{start, end});
        return answer.subList(1, answer.size()).toArray(new int[0][]);
    }
}