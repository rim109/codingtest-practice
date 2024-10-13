class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        for (i in numbers) {
            answer += i
        }
        answer = 45 - answer
        return answer
    }
}