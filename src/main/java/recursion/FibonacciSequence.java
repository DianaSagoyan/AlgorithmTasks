package recursion;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
    public static void main(String[] args) {
        //Write a Java program to print a Fibonacci sequence using recursion.

        int num = 10;

        System.out.print("A Fibonacci sequence of " + num + " numbers: ");

        for (int i = 0; i < num; i++) {
            System.out.print(fibonacciSequence(i) + " ");
        }


        fibonacciSequence(num);
    }

    public static int fibonacciSequence(int num){
        if(num <= 1) return num;

        return fibonacciSequence(num - 1) + fibonacciSequence(num - 2);
    }
}
