class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
            

        for (int i = 0; i < s.length(); i++){
            char cs = s.charAt(i);
            
            if (cs == 'p' || cs == 'P'){
                p++;
            } else if (cs == 'y' || cs == 'Y'){
                y++;
            }
        }
        answer = (p == y);
        return answer;
    }
}