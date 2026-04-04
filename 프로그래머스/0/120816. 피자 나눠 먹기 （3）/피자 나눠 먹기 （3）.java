class Solution {
    public int solution(int slice, int n) {
        int answer =0;
        if(slice<n && n%slice >=1){
                answer = n/slice +1;  
        } else if(slice<n && n%slice == 0){
            answer = n/slice;
        } else if(slice>=n){
            answer =1 ;
        }
            
        return answer;
    }
}