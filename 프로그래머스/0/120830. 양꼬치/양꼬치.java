class Solution {
    public int solution(int n, int k) {
        int food = 12000*n;
        int drink = 2000*k;
        int answer = food  + drink - ( n / 10 * 2000);
        return answer;
    }
}