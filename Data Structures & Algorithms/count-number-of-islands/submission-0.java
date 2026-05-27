class Solution {
    private static final int[][] dirs = new int[][]{{1,0},{-1,0},{0,-1},{0,1}};
    int islands = 0;
    public int numIslands(char[][] grid) {
        int ROW = grid.length, COL = grid[0].length;
        for(int i=0;i<ROW;i++){
            for(int j=0;j<COL;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void dfs(char[][] grid, int r, int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]=='0'){
            return;
        }
        grid[r][c] = '0';
        for(int[] dir:dirs){
            dfs(grid, dir[0]+r, dir[1]+c);
        }
    }

}
