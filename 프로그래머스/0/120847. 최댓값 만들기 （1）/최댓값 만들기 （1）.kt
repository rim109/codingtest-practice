class Solution {
    fun solution(numbers: IntArray): Int {
        val list = numbers.sorted()
        var answer = (list.last()) * (list[list.size - 2])
        return answer
    }
}