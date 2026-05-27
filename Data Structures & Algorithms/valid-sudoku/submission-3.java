class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashSet<Character> set = new HashSet<>();
        for(int i=0;i<9;i++){
          for (int j=0;j<9;j++){
            if(board[i][j]!='.'){
              if(!set.add(board[i][j])) return false; 
            }
          }
          set.clear();
        }
        for(int i=0;i<9;i++){
          for (int j=0;j<9;j++){
            if(board[j][i]!='.'){
              if(!set.add(board[j][i])) return false; 
            }
          }
          set.clear();
        }
        int x=0;
        int y=0;
      for(int p=0;p<9;p++){
        for(int i=x;i<x+3;i++){
          for(int j=y;j<y+3;j++){
            if(board[i][j]!='.'){
              if(!set.add(board[i][j])) return false; 
            }
          }
        }
        set.clear();
        x+=3;
        if(x==9){
        x=0;
        y+=3;

      }

      
    }
    return true;
}
}
