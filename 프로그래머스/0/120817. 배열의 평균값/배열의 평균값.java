class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        for (double num: numbers){
            sum += num;
        }
        double answer = sum / numbers.length;
        return answer;
    }
}