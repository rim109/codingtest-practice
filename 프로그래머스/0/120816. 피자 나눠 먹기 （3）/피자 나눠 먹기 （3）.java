class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        while (n > slice * answer){
            answer ++ ;
        }
        return answer;
    }
}