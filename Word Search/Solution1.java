import java.util.*;;
class Solution {
    boolean[][] v;
    int n,m;
    public List<String> findWords(char[][] board, String[] words) {
        n = board.length;
        m = board[0].length;
        Set<String> set = new HashSet<>();
        List<String> ans = new ArrayList<>();
        for(String word:words){
            v = new boolean[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(word.charAt(0)==board[i][j] && dfs(i,j,board,0,word) &&                                      !set.contains(word)){
                        ans.add(word);
                        set.add(word);
                    }
                }
            }
        }
        return ans;
    }
    
    public boolean dfs(int i,int j,char[][] board,int at,String word){
        if(at==word.length()) return true;
        if(i>=n || i<0 || j>=m || j<0 || 
           v[i][j] || board[i][j]!=word.charAt(at)) return false;
        
        v[i][j] = true;
        
        if(dfs(i+1,j,board,at+1,word) || dfs(i-1,j,board,at+1,word) ||
            dfs(i,j+1,board,at+1,word) || dfs(i,j-1,board,at+1,word)) return true;
        
        v[i][j] = false;
        
        return false;
    }
}