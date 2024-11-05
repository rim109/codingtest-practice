class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i : num_list) {
            int a = i;
            while (a > 1) {
                if (a % 2 == 0) {
                    a /= 2;
                } else {
                    a = (a - 1) / 2;
                }
                answer++;
            }
        }
        return answer;
    }
}