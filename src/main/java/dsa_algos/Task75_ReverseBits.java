package dsa_algos;

public class Task75_ReverseBits {
    public static void main(String[] args) {
        //Reverse bits of a given 32 bits unsigned integer.

        int num = 7;
        System.out.println(reverseBits(num));
    }

    public static int reverseBits(int num){
        int reverse = 0;

        for (int i = 0; i < 32; i++) {
            reverse = reverse << 1;

            reverse = reverse | (1 & num);

            num = num >> 1;
        }
        return reverse;
    }
}
