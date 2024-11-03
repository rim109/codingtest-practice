class Solution {
    public String solution(int n) {
        String su = "수";
        String bak = "박";
        
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                stringBuilder.append(su);
            } else {
                stringBuilder.append(bak);
            }
        }
        
        return stringBuilder.toString();
    }
}