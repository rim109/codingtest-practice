class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i); 
            if (Character.isLowerCase(c)) { 
                answer.append(Character.toUpperCase(c)); 
            } else {
                answer.append(Character.toLowerCase(c)); 
            }
        }
        
        return answer.toString(); 
    }
}