package dsa_algos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task28_AssigningCookies {
    public static void main(String[] args) {
        //Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
        //
        //Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will
        // be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content.
        // Your goal is to maximize the number of your content children and output the maximum number.

        int[] g = {1, 2, 3};
        int[] s = {1, 2};
        System.out.println(assignCookies(g, s));
    }

    public static int assignCookies(int[] g, int[] s){

        Arrays.sort(g);
        Arrays.sort(s);

        int pointer1 = 0, pointer2 = 0;
        int count = 0;

        while (pointer1 < s.length && pointer2 < g.length){
            if(s[pointer1] >= g[pointer2]){
                count++;
                pointer2++;
            }
            pointer1++;
        }
        return count;
    }
}
