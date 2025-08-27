package matrix;
//You are given an m x n grid where each cell can have one of three values:
//
//0 representing an empty cell,
//1 representing a fresh orange, or
//2 representing a rotten orange.
//Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.
//
//Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

//Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
//Output: 4

import java.util.LinkedList;
import java.util.Queue;

//Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
//Output: -1
//Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
public class RottenOranges {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(rottingOranges(grid));
    }

    public static int rottingOranges(int[][] grid){
        int row = grid.length, col = grid[0].length;
        int fresh = 0, time = 0;

        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 2) queue.add(new int[]{i, j});
                else if (grid[i][j] == 1) fresh++;
            }
        }

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int x = queue.peek()[0], y = queue.peek()[1];
                queue.remove();

                if(x > 0 && grid[x - 1][y] == 1){
                    grid[x - 1][y] = 2;
                    queue.add(new int[]{x - 1, y});
                    fresh--;
                }

                if(y > 0 && grid[x][y - 1] == 1){
                    grid[x][y - 1] = 2;
                    queue.add(new int[]{x, y - 1});
                    fresh--;
                }

                if(x < row - 1 && grid[x + 1][y] == 1){
                    grid[x + 1][y] = 2;
                    queue.add(new int[]{x + 1, y});
                    fresh--;
                }

                if(y < col - 1 && grid[x][y + 1] == 1){
                    grid[x][y + 1] = 2;
                    queue.add(new int[]{x, y + 1});
                    fresh--;
                }
            }

            if(!queue.isEmpty()) time++;

        }

        return fresh == 0 ? time : -1;
    }
}
