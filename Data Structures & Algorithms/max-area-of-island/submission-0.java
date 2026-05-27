class Solution {
    private static final int[][] dirs = new int[][]{{1,0},{-1,0},{0,-1},{0,1}};
    public int maxAreaOfIsland(int[][] grid) {
        int ROW = grid.length, COL = grid[0].length;
        int biggestIsland = 0;
        for(int r=0;r<ROW;r++){
            for(int c=0;c<COL;c++){
                if(grid[r][c]==1){
                    biggestIsland = Math.max(biggestIsland, dfs(grid,r,c));
                }
            }
        }
        return biggestIsland;
    }
    private int dfs(int[][] grid, int r, int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0){
            return 0;
        }
        grid[r][c] = 0;
        int res = 1;
        for(int[] dir:dirs){
            res += dfs(grid,dir[0]+r,dir[1]+c);
        }
        return res;
    }
}
