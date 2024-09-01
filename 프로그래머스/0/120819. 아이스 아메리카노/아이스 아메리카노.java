class Solution {
    public int[] solution(int money) {
        var n = money / 5500;
        var change = money - (n * 5500);
        return new int[] {n, change};
    }
}