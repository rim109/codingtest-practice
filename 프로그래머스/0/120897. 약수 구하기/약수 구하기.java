import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> di = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                di.add(i);
            }
        }
        
        int[] answer = new int[di.size()];
        for (int i = 0; i < di.size(); i++) {
            answer[i] = di.get(i);
        }
        
        return answer;
    }
}
