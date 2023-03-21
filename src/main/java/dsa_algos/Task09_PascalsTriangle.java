package dsa_algos;

import java.util.Arrays;
import java.util.List;

public class Task09_PascalsTriangle {
    //Given an integer numRows, return the first numRows of Pascal's triangle.
    //
    //In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

    public static void main(String[] args) {
        int num = 5;
        System.out.println(triangle(num));
    }

    public static List<List<Integer>> triangle(int numRows) {
        int[][] pascal = new int[numRows][];
        for (int i = 0; i < numRows; i++){
            int[] row = new int[i + 1];
            row[0] = 1;
            row[i] = 1;
            for (int j = 1; j < i; j++){
                row[j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
            pascal[i] = row;
        }
        return (List) Arrays.asList(pascal);
    }
}
