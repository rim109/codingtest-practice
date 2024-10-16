import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        var s = sqrt(n.toDouble())
         return if (s == s.toLong().toDouble()) {
            (s.toLong() + 1) * (s.toLong() + 1)
        } else {
             -1
        }
    }
}