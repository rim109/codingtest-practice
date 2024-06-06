class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in numbers) answer += 2 * i
        return answer
    }
}