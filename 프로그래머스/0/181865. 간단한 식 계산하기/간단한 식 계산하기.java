class Solution {
    public int solution(String binomial) {
        String[] parts = binomial.split(" "); 
        int num1 = Integer.parseInt(parts[0]); 
        String operator = parts[1]; 
        int num2 = Integer.parseInt(parts[2]); 

        if (operator.equals("+")) {
            return num1 + num2;
        } else if (operator.equals("-")) {
            return num1 - num2;
        } else if (operator.equals("*")) {
            return num1 * num2;
        } else {
            return -1; 
        }
    }
}