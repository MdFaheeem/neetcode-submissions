class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row<9;row++){
            Set<Character> seenRow = new HashSet<>();
            Set<Character> seenCol = new HashSet<>();
            for(int col = 0;col<9;col++){
                char ch = board[row][col];
                if(ch != '.'){
                    if(!seenRow.contains(ch)){
                        seenRow.add(ch);
                    }
                    else{
                        return false;
                    }
                }
                if(board[col][row] != '.'){
                    if(!seenCol.contains(board[col][row])){
                        seenCol.add(board[col][row]);
                    }
                    else{
                        return false;
                    }    
                }
            }
        }
        for(int boxRow = 0; boxRow<3;boxRow++){
            for(int boxCol =0; boxCol<3;boxCol++){
                int startRow = boxRow * 3;
                int startCol = boxCol * 3;
                Set<Character> boxSet =  new HashSet<>();
                for(int i = startRow;i<startRow + 3;i++){
                    for(int j = startCol; j<startCol + 3; j++){
                        char ch =  board[i][j];
                        if(ch != '.'){
                            if(boxSet.contains(ch)){
                                return false;
                            }
                            else{
                                boxSet.add(ch);
                            }
                        }
                    }
                }
            }
        }
         return true;
    }
}
