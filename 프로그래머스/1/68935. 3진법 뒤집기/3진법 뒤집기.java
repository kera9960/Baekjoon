class Solution {
    public int solution(int n) {
        int answer = 0;
        String ternary = "";
        do{
            int remainder = n%3;
            ternary = ternary + remainder;
            n = n/3;
        } while(n != 0);
        for(int i=0;i<ternary.length();i++){
            int a = Character.getNumericValue(ternary.charAt(i));
            answer += (int)Math.pow(3,ternary.length()-1-i)*a;
        }
        return answer;
    }
}