class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length1 = t.length();
        int length2 = p.length();
        long num1;
        long num2 = Long.parseLong(p);
        String sub = "";
        for(int i = 0;i<length1-length2+1;i++){
                sub = t.substring(i,i+length2);
                num1 = Long.parseLong(sub);
                if(num1<=num2){
                    answer++;
                }
        }
        return answer;
    }
}