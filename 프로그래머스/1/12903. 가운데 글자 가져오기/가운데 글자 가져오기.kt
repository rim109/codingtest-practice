class Solution {
    fun solution(s: String): String {
        var answer = ""
        var l = s.length
        if (l % 2 == 0){
            answer = s.substring((l / 2) - 1, (l / 2) + 1)
        } else {
            answer = s.substring(l / 2, (l / 2) + 1)
        }
        return answer
    }
}