package numbers;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] nums = {3, 7, 5, 1};
        System.out.println(secondLargest(nums));
    }

    public static int secondLargest(int[] nums){
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > highest){
                secondHighest = highest;
                highest = nums[i];
            } else if(nums[i] > secondHighest){
                secondHighest =nums[i];
            }
        }
        return secondHighest;
    }
}
