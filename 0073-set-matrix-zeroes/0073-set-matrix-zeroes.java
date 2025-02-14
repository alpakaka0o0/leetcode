class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        for (int r = 0; r < rows; r++){
            if (matrix[r][0] == 0){
                firstColHasZero = true;
                break;
            }
        }

        for (int c = 0; c < cols; c++){
            if (matrix[0][c] == 0){
                firstRowHasZero = true;
                break;
            }
        }

        for (int x= 1; x < rows; x++){
            for (int y = 1; y < cols; y++){
                if (matrix[x][y] == 0){
                    matrix[x][0] = 0;
                    matrix[0][y] = 0;
                }
            }
        }

        for (int r = 1; r < rows; r++) {
            if (matrix[r][0] == 0) {
                for (int c = 1; c < cols; c++) {
                    matrix[r][c] = 0;
                }
            }
        }

        for (int c = 1; c < cols; c++) {
            if (matrix[0][c] == 0) {
                for (int r = 1; r < rows; r++) {
                    matrix[r][c] = 0;
                }
            }
        }
        if (firstRowHasZero) {
            for (int c = 0; c < cols; c++) {
                matrix[0][c] = 0;
            }
        }

        if (firstColHasZero) {
            for (int r = 0; r < rows; r++) {
                matrix[r][0] = 0;
            }
        }  
    }
}