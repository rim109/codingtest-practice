class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i : array){
            answer += Integer.toString(i).chars().filter(ch -> ch == '7').count();
        }
        return answer;
    }
}
