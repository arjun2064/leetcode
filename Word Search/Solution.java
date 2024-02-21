class Solution {
    public boolean exist(char[][] board, String word) {
        
        int curr=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(helper(board, word,  i,  j, curr)) return true; 
            }
        }

        return false;

    }

    public static boolean helper(char[][] board, String word, int i, int j, int curr){

        if(i<0 || j<0 || i>board.length-1 || j>board[0].length-1  || curr > word.length()-1 || board[i][j]=='*' || board[i][j]!=word.charAt(curr)){
            return false;
        }
    
        char temp = board[i][j];
        board[i][j]='*';
        if(curr == word.length()-1) return true;
        else if(helper(board,word,i+1,j,curr+1) ||
                helper(board,word,i,j+1,curr+1)||
                helper(board,word,i,j-1,curr+1)||
                helper(board,word,i-1,j,curr+1)){
                    return true;
        }
                    board[i][j]=temp;

    return false;
    }

}