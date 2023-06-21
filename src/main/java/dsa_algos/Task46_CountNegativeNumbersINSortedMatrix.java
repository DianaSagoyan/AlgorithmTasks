package dsa_algos;

public class Task46_CountNegativeNumbersINSortedMatrix {
    public static void main(String[] args) {
        //Count Negative Numbers in a Sorted Matrix
        int[][] matrix = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(negativeNumbersCount(matrix));
    }
    
    public static int negativeNumbersCount(int[][] matrix){
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < 0) count++;
            }
        }
        return count;
    }
}
