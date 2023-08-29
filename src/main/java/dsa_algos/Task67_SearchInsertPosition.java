package dsa_algos;

public class Task67_SearchInsertPosition {
    public static void main(String[] args) {
        //Given a sorted array of distinct integers and a target value, return the index if the target is found.
        // If not, return the index where it would be if it were inserted in order.
        //
        //You must write an algorithm with O(log n) runtime complexity.

        int[] nums = {1, 3, 5, 6};
        int target = 8;

        System.out.println(positionOfTarget(nums, target));
    }

    public static int positionOfTarget(int[] nums, int target){
        int left = 0, right = nums.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target) return mid;
            if(target < nums[mid]) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }
}
