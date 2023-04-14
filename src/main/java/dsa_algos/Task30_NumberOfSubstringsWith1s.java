package dsa_algos;

public class Task30_NumberOfSubstringsWith1s {
    public static void main(String[] args) {
        //Given a binary string s, return the number of substrings with all characters 1's. Since the answer may be too large, return it modulo 109 + 7.
        String s = "0110111";
        System.out.println(numberOfSubstringsWith1s(s));
    }

    //Doesn't pass all in leetcode
//    public static int numberOfSubstringsWith1s(String s){
//        int index = 0;
//        int answer = 0;
//
//        while(index != s.length()){
//            int count = 0;
//            if(s.charAt(index) != '1'){
//                index++;
//            } else {
//                while(s.charAt(index)== '1'){
//                    index++;
//                    count++;
//                    if(index == s.length()) break;
//                }
//                answer += (count * (count + 1)) / 2;
//            }
//        }
//        return answer;
//    }

    public static int numberOfSubstringsWith1s(String s){
        int answer = 0;
        int count = 0;
        int mod = 1_000_000_007;

        for(int i = 0; i < s.length(); i++){
            count = s.charAt(i) == '1' ? count + 1 : 0;
            answer = (answer + count) % mod;
        }
        return answer;
    }


}
