class Solution {
    void setZeroes(int[][] matrix, boolean[][] changes, int i, int j){
        for(int m = 0; m < matrix[0].length; m++){
            if(matrix[i][m] != 0){
                matrix[i][m] = 0;
                changes[i][m] = true;
            }
        }
        
        for(int n = 0; n < matrix.length; n++){
            if(matrix[n][j] != 0){
                matrix[n][j] = 0;
                changes[n][j] = true;
            }
        }
    }
    
    public void setZeroes(int[][] matrix) {
        boolean[][] changes = new boolean[matrix.length][matrix[0].length];
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0 && !changes[i][j]){
                    setZeroes(matrix, changes, i, j);
                }
            }
        }
    }
}

