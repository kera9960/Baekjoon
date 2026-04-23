class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char a;
        for(int i =0; i<s.length();i++){
            a = s.charAt(i);
            if(a !=' '){
                if(a>=65 && a<=90){
                    a =  (char) (a + n%26);
                    if(a>90){
                        a = (char) (a-26);
                    }
                } else if(a>=97 && a<=122){
                    a = (char)(a + n%26);
                    if(a>122){
                        a = (char)(a-26);
                    }
                }
            }
            answer +=a;
        }
        return answer;
    }
}