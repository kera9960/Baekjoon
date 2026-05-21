class Solution {
    public int solution(String s) {
        int answer = 0;
        char target = s.charAt(0);
        int same = 0;
        int diff = 0;
        boolean isNewGroup = true;
        for(int i = 0; i<s.length();i++) {
            if(isNewGroup) {
                target = s.charAt(i);
                same = 0;
                diff = 0;
                isNewGroup = false;
            }
            if(target == s.charAt(i)) {
                same++;
            } else {
                diff++;
            }
            if(same == diff) {
                answer++;
                isNewGroup = true;
            }
        }
        if(!isNewGroup) {
            answer++;
        }
        return answer;
    }
}