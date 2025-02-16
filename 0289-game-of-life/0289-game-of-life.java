class Solution {
    public void gameOfLife(int[][] board) {
        List<List<Integer>> needToChange = new ArrayList<>();
        int rows = board.length;
        int cols = board[0].length;

        int[] dx = new int[] {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = new int[] {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int r = 0; r < rows; r++){
            for (int c = 0; c < cols; c++){
                int count = 0;
                for (int d = 0; d < 8; d++){
                    int nextX = r + dx[d];
                    int nextY = c + dy[d];
                    if (((nextX >= 0) && (nextX < rows)) && ((nextY >= 0 )&&(nextY < cols))){
                        if (board[nextX][nextY] == 1){
                            count++;
                        }    
                    }    
                }
                // live cell
                if (board[r][c] == 1){
                    if ((count < 2) || (count > 3)){
                        needToChange.add(Arrays.asList(r, c));
                    }
                }else{ // dead cell
                    if (count == 3){
                        needToChange.add(Arrays.asList(r, c));
                    }
                }
            }
        }
        System.out.println(needToChange.toString());

        for (int i = 0; i < needToChange.size(); i++){
            int x = needToChange.get(i).get(0);
            int y = needToChange.get(i).get(1);

            board[x][y] = (board[x][y] == 1 ? 0 : 1);
        }

        
    }
}