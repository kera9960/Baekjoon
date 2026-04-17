class Solution {
    public boolean solution(String s) {
        boolean answer = true;
    if(s.length() ==4 || s.length() ==6){
        for(char e : s.toCharArray()){
            if(!Character.isDigit(e)){
                answer = false;
                break;
            }
        }
    } else answer = false;
    
    return answer;
    }
}