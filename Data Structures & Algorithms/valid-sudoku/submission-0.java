class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int j = 0; j < 9 ; j++) {
            Set<Character> setHorizontal = new HashSet<>(); 
            for(int i = 0; i < 9; i++) {
                if(board[j][i] != '.') {
                    if(!setHorizontal.add(board[j][i])) return false;
                }
            } 
        }

        for(int i = 0; i < 9 ; i++) {
            Set<Character> setVertical = new HashSet<>(); 
            for(int j = 0; j < 9; j++) {
                if(board[j][i] != '.') {
                    if(!setVertical.add(board[j][i])) return false;
                }
            } 
        }

        for(int l = 0; l < 9; l = l + 3) {
            for(int k = 0; k < 9; k = k + 3) {
                Set<Character> setGrid = new HashSet<>();
                for(int i = l; i < l + 3; i++) {
                    for(int j = k; j < k + 3; j++ ) {
                        if(board[i][j] != '.') {
                            if(!setGrid.add(board[i][j])) return false;
                        }
                    }
                }
            }
        }

        return true; 
    }
}
