import java.util.*

class Solution {
    fun solution(sides: IntArray): Int {
        var min = Math.abs(sides[0] - sides[1]) + 1
        var max = (sides[0] + sides[1]) - 1
        var answer = max - min + 1
        return answer
    }
}