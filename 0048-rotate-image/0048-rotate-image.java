class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] rotateMatrix = new int[n][n];
        for (int r = 0; r < n; r++){
            for (int c = 0; c < n; c++){
                rotateMatrix[r][c] = matrix[n-c-1][r];
            }
        }
        for (int r = 0; r < n; r++){
            for (int c = 0; c < n; c++){
                matrix[r][c] = rotateMatrix[r][c];
            }
        }
    }
}