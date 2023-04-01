class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int a=1; a<=n; a++){
            if(a%2==0){
                answer+=a;
            }
        }
        return answer;
    }
}