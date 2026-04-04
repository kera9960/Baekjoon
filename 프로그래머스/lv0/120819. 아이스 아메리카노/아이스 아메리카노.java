class Solution {
    public int[] solution(int money) {
        int a = money/5500;
        int[] answer = new int[2];
        if(money%5500 == 0){
            answer[0] = a;
            answer[1] = 0;
        } else if(money%5500 >0){
            answer[0] = a;
            answer[1] = money%5500;
        }
        
        return answer;
    }
}