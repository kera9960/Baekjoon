import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> results = new ArrayList<>();
        Arrays.sort(numbers);
        for(int i =0;i<numbers.length;i++){
            for(int j = i+1;j<numbers.length;j++){
                if(!results.contains(numbers[i]+numbers[j])){
                results.add(numbers[i]+numbers[j]);}
            }
        }
        Collections.sort(results);
        int[] answer = new int[results.size()];
        for(int i= 0;i<results.size();i++){
            answer[i] = results.get(i);
        }
        return answer;
    }
}