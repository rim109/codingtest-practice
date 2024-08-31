class Solution {
    public int[] solution(int n) {
        int s = (n + 1) / 2;
        int[] answer = new int[s];
        int index = 0;
        
        for (int i = 1 ; i <= n ; i += 2){
            answer[index] = i;
            index++;
        }
        return answer;
    }
}