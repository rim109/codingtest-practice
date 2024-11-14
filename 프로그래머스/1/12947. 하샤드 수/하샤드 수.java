class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int answer = x;

        while (answer > 0) {
            sum += answer % 10;
            answer /= 10; 
        }
        return x % sum == 0;
    }
}