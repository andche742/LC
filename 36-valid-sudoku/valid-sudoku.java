class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Create 2D boolean arrays to track numbers in rows, columns, and boxes
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';  // Convert char '1'-'9' to index 0-8
                    int boxIndex = (i / 3) * 3 + (j / 3);  // Calculate 3x3 box index
                    
                    // Check if the number has already been seen in the row, column, or box
                    if (rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
                        return false;
                    }
                    
                    // Mark the number as seen in the row, column, and box
                    rows[i][num] = true;
                    cols[j][num] = true;
                    boxes[boxIndex][num] = true;
                }
            }
        }
        
        return true;  // If no violations are found, the Sudoku is valid
    }
}