class Solution {
    fun solution(rsp: String): String {
        var answer: String = ""
        for ( i in rsp ){
            answer += when(i) {
                '2' -> '0'
                '0' -> '5'
                '5' -> '2'
                else -> i
            }
        }
        return answer
    }
}