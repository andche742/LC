class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // char num = board[i][j];
                if (board[i][j] != '.') {
                    if (!seen.add(i + "row" + board[i][j]) ||
                    !seen.add(j + "column" + board[i][j]) || 
                    !seen.add(i/3+ "-" + j/3 + "box" + board[i][j]))  {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}