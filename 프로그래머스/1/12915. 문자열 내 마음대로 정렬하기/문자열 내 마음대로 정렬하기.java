import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        int a = strings.length;
        for(int i=0; i<a;i++){
            for(int j =0;j<a-i-1;j++){
                if(strings[j].charAt(n)>strings[j+1].charAt(n)){
                    String change = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = change;
                } else if(strings[j].charAt(n)==strings[j+1].charAt(n)){
                    if(strings[j].compareTo(strings[j+1])>0){
                        String change = strings[j];
                        strings[j] = strings[j+1];
                        strings[j+1] = change;
                    }
                }
            }
        }
        return strings;
    }
}