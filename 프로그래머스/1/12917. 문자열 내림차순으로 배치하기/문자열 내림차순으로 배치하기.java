import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String a = new String(arr);
        StringBuilder sb = new StringBuilder(a);
        answer = sb.reverse().toString();
        return answer;
    }
}