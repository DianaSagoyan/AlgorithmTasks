package dsa_algos;

public class Task38_CheckIfStraightLine {
    public static void main(String[] args) {
        //You are given an array coordinates, coordinates[i] = [x, y], where [x, y]
        // represents the coordinate of a point.
        // Check if these points make a straight line in the XY plane.

        int[][] coordinates = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        System.out.println(isStraightLine(coordinates));
    }

    public static boolean isStraightLine(int[][] coordinates){

        for(int i = 2; i < coordinates.length; i++){

            if((coordinates[1][1] - coordinates[0][1]) * (coordinates[i][0] - coordinates[0][0])
            != (coordinates[i][1] - coordinates[0][1]) * (coordinates[1][0] - coordinates[0][0])) return false;

        }

        return true;
    }
}
