class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 6
        while (answer % n != 0){
            answer += 6
        }
        return answer / 6
    }
}