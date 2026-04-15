class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int e:numbers){
            if(e >= 0 && e<=9){
                answer -=e;
            }
        }
        return answer;
    }
}