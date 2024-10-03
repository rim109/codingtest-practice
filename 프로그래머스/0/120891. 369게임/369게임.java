class Solution {
    public int solution(int order) {
        int answer = 0;
        String s = String.valueOf(order);
        
        for (int i = 0; i < s.length(); i++ ){
            char cs = s.charAt(i);
            if (cs == '3' || cs == '6' || cs == '9'){
                answer ++ ;
            }
        }
        return answer;
    }
}