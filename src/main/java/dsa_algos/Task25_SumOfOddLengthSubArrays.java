package dsa_algos;

public class Task25_SumOfOddLengthSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumOfOddSubArray(arr));
    }
    
    public static int sumOfOddSubArray(int[] arr){
        int sum=0;
        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            int left = i+1;
            int right = n-i;
            int k = left * right;
            int odd = (k+1)/2;
            sum = sum + odd*arr[i];
        }
        return sum;
    }

}
