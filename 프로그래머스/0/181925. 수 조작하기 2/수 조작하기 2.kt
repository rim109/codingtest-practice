class Solution {
    fun solution(numLog: IntArray): String {
        var answer: String = ""
        for (i in 0 until numLog.size - 1){
            val diff = numLog[i + 1] - numLog[i]
            if (diff == 1){
                answer += 'w'
            } else if (diff == -10){
                answer += 'a'
            } else if (diff == 10){
                answer += 'd'
            } else {
                answer += 's'
            }
        }
        return answer
    }
}