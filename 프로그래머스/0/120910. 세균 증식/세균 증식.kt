class Solution {
    fun solution(n: Int, t: Int): Int {
        var answer = n
        for (i in 0..t-1) {
            answer *= 2
        }
        return answer
    }
}