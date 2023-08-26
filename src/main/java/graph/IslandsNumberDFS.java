package graph;

public class IslandsNumberDFS {
    public int numIslands(char[][] grid) {
        int island = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '0') continue;

                ++island;
                recursiveDFSSearch(grid, row, col);
            }
        }

        return island;
    }

    public void recursiveDFSSearch(char[][] grid, int col, int row){
        if (col >= grid.length || col < 0
                || row >= grid[0].length || row < 0
                || grid[col][row] == '0'){
            return;
        }

        grid[col][row] = '0';

        recursiveDFSSearch(grid, col - 1, row);
        recursiveDFSSearch(grid, col + 1, row);
        recursiveDFSSearch(grid, col, row + 1);
        recursiveDFSSearch(grid, col, row - 1);
    }
}
