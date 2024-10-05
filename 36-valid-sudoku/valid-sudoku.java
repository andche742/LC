
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    char num = board[i][j];
                    // Instead of concatenating strings, create a unique key using the number in row, column, and box
                    if (!seen.add(num + " in row " + i) || 
                        !seen.add(num + " in col " + j) || 
                        !seen.add(num + " in box " + i/3 + "-" + j/3)) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}