package numbers;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReturnIntersection {
    public static void main(String[] args) {
        Set<Object> set1 = new LinkedHashSet<>(Set.of(1, 2, 3, 5, 4));
        Set<Object> set2 = new LinkedHashSet<>(Set.of(9, 8, 7, 6, 5, 4));
        System.out.println(getIntersection(set1, set2));
    }

//    public static int getIntersection(Set<Integer> set1, Set<Integer> set2){
//
//        int result = -1;
//
//        for(Integer each: set1){
//            if(set2.contains(each)){
//                result = each;
//                break;
//            }
//        }
//        return result;
//    }

    public static Set<Object> getIntersection(Set<Object> a, Set<Object> b){
//        if (a.size() > b.size()) {
//            a.retainAll(b);
//            return a;
//        } else {
//            b.retainAll(a);
//            return b;
//        }
        b.retainAll(a);
        return b;
    }
}
