import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> answer = new ArrayList<>();
        for (int i = start_num ; i <= end_num ; i++){
            answer.add(i);
        }
        
        int [] result = new int [answer.size()];
        for (int i = 0; i < answer.size() ; i++){
            result[i] = answer.get(i);
        }
        return result;
    }
}