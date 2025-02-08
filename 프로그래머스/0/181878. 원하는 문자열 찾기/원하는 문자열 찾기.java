class Solution {
    public int solution(String myString, String pat) {
        boolean answer = myString.toLowerCase().contains(pat.toLowerCase());
        if (answer) {
            return 1; 
        } else {
            return 0;
        }
    }
}