package leetcode_Udemy;

public class MaximumProductSubarray {
    public static void main(String[] args) {
//        int[] nums = {0, 2, -3, 4, -5};  120
        int[] nums = {2, 3, -2, 4};
        System.out.println(maxProductSubarray(nums));
    }

    public static int maxProductSubarray(int[] nums) {
        int min = 1;
        int max = 1;
        int answer = nums[1];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                max = 1;
                min = 1;
                answer = Math.max(answer, 0);
            }
            int tmp = min;
            max = Math.max(nums[i], Math.max(nums[i] * max, nums[i] * min) );
            min = Math.min(nums[i], Math.min(nums[i] * tmp, nums[i] * min));
            answer = Math.max(answer, max);
        }

        return answer;
    }
}
