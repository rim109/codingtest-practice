class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        if ((s.length != 4 && s.length != 6 ) || !s.all { it.isDigit() }){
            return false
        }
        return answer
    }
}

