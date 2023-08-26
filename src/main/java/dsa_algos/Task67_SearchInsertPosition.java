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
        int result = 0;
        if(target < nums[nums.length - 1]){
            int left = 0;
            int right = nums.length - 1;

            while (left < right){
                int mid = (left + right) / 2;
                if(target == nums[mid]) {
                    result = mid;
                    break;
                }
                if(target < nums[mid]) right = mid - 1;
                if(target > nums[mid]) left = mid + 1;
            }

        } else {
            result = nums.length + (target - nums[nums.length - 1] - 1);
        }
        return result;
    }
}
