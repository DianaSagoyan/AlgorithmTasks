package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindIntersection {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(findIntersection(nums1, nums2)));
    }

    public static int[] findIntersection(int[] nums1, int[] nums2){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();


        for(int i = 0 ; i < nums1.length ; i++){

            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);

        }

        for(int i = 0 ; i < nums2.length ; i++){

            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }

        int[] result = new int[list.size()];
        int index = 0;
        for(int each: list){
            result[index++] = each;
        }

        return result;
    }
}
