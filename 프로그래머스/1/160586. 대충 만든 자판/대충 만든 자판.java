import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i < keymap.length;i++) {
            for(int j = 0;j<keymap[i].length();j++){
                char c = keymap[i].charAt(j);
                int count = j + 1;
                if(map.containsKey(c)) {
                    if(map.get(c)>count) {
                        map.put(c,count);
                    }
                } else {
                    map.put(c,count);
                }
            }
        }
        for(int k = 0; k < targets.length;k++) {
            int sum = 0;
            boolean impossible = false;
            for(int l = 0; l < targets[k].length();l++) {
                char a = targets[k].charAt(l);
                if(map.containsKey(a)) {
                    sum += map.get(a);
                } else {
                    impossible = true;
                    break;
                }
            }
            if(impossible){
                    answer[k] = -1;
                } else {
                    answer[k] = sum;
                }
        }
        
        return answer;
    }
}