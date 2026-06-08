class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            int count = 0;
            while(count < index) {
                current++;
                if(current >= 123) {
                    current = 97;
                }
                if(skip.indexOf(current) == -1) {
                    count++;
                }
            }
            answer += current;
        }
        return answer;
    }
}